package com.zomeli.services.cross.paymentexecution.controller;

import com.zomeli.services.cross.paymentexecution.model.MoneyTransferHeaders;
import com.zomeli.services.cross.paymentexecution.model.WorkFlowRequest;
import com.zomeli.services.cross.paymentexecution.model.generate.MoneyTransferRequest;
import com.zomeli.services.cross.paymentexecution.workFlow.AccountingTransferExecutionWorkFlow;
import io.quarkus.temporal.runtime.builder.WorkflowBuilder;
import java.util.UUID;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.jboss.logmanager.Logger;
import org.jboss.logmanager.MDC;

@Path("/temporal")
@ApplicationScoped
public class TemporalController {
    private static final Logger log = Logger.getLogger(String.valueOf(TemporalController.class));

    @Inject
    WorkflowBuilder workflowBuilder;

    @GET
    public String hello() {
        return "Hello from RESTEasy Reactive";
    }


    @Path("/transfer")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response initTransfer(@HeaderParam("Authorization") @NotNull   String authorization,
                                       @HeaderParam("Request-ID") @NotNull @Pattern(regexp="^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[34][0-9a-fA-F]{3}-[89ab][0-9a-fA-F]{3}-[0-9a-fA-F]{12}$") @Size(max=36)   String requestID,
                                       @HeaderParam("request-date") @NotNull @Pattern(regexp="^\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}\\.\\d{3}[+-]\\d{4}([a-z]|[A-Z]|\\d)?$") @Size(max=29)   String requestDate,
                                       @HeaderParam("opn-number") @NotNull   String opnNumber,
                                       @HeaderParam("opn-reverse-number")   String opnReverseNumber,
                                       @Valid @NotNull MoneyTransferRequest moneyTransferRequest) {

        var uuid = UUID.randomUUID().toString();
        MDC.put("request.id", uuid);
        log.info("Start");

        var tripBookingWorkflow =
            workflowBuilder.build(AccountingTransferExecutionWorkFlow.class, uuid);

        String data = tripBookingWorkflow.initWorkFlow(
            WorkFlowRequest.builder()
                .uuid(uuid)
                .moneyTransferHeaders(MoneyTransferHeaders.builder()
                    .token(authorization)
                    .requestId(requestID)
                    .requestDate(requestDate)
                    .opnNumber(opnNumber)
                    .build())
                .transferRequest(moneyTransferRequest)
            .build());

        log.info("End");
        return Response.ok(data).build();
    }
}
