package com.zomeli.services.cross.paymentexecution.proxy;

import com.zomeli.services.cross.paymentexecution.entity.TransferDto;
import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("/send")
@RegisterRestClient(configKey="client-mock")
@ApplicationScoped
public interface MockClient {

    @Path("/message")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    String getMock(TransferDto stream);
}


