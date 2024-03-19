package com.zomeli.services.cross.paymentexecution.controller;

import com.zomeli.services.cross.paymentexecution.model.generate.MoneyTransferRequest;
import com.zomeli.services.cross.paymentexecution.repository.PersonRepository;
import com.zomeli.services.cross.paymentexecution.repository.TransferRepository;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/transfer")
@ApplicationScoped
public class TransferController {

  @Inject
  TransferRepository repositoryTransfer;

  @Inject
  PersonRepository personRepository;

  @Path("/list")
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public Response transfer() {

    var data = personRepository.findByPersonId(1);
     return Response.ok(data).build();

//    return Response.ok(repositoryTransfer.getList()).build();

  }

  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  public Response transferAccount(@HeaderParam("authorization") String token, @HeaderParam("opn-number") String operationNumber,
                                  MoneyTransferRequest transfer) {

    return Response.ok(transfer).build();

  }


}
