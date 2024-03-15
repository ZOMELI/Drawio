package com.zomeli.services.cross.paymentexecution.controller;

import com.zomeli.services.cross.paymentexecution.entity.TransferDto;
import com.zomeli.services.cross.paymentexecution.workFlow.AccountingTransferExecutionWorkFlow;
import io.quarkus.temporal.runtime.builder.WorkflowBuilder;
import java.util.UUID;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.jboss.logmanager.Logger;
import org.jboss.logmanager.MDC;

@Path("/transfer")
@ApplicationScoped
public class GreetingController {
    private static final Logger log = Logger.getLogger(String.valueOf(GreetingController.class));

    @Inject
    WorkflowBuilder workflowBuilder;

    @GET
    public String hello() {
        return "Hello from RESTEasy Reactive";
    }

    @Path("/mock")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public String transfer(TransferDto id) {
        var uuid = UUID.randomUUID().toString();
        MDC.put("request.id", uuid);
        log.info("Start");


        var tripBookingWorkflow =
            workflowBuilder.build(AccountingTransferExecutionWorkFlow.class, uuid);
        String data = tripBookingWorkflow.initWorkFlow("1947821454732","1947828514822", uuid , Double.valueOf("15.63"));

        log.info("End");
        return "Response :  " + data;
    }
}
