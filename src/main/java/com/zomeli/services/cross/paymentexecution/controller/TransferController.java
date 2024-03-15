package com.zomeli.services.cross.paymentexecution.controller;

import com.zomeli.services.cross.paymentexecution.entity.TransferDto;
import com.zomeli.services.cross.paymentexecution.repository.TransferRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/transfer")
@ApplicationScoped
public class TransferController {

  @Inject
  TransferRepository repositoryTransfer;


  @Path("/list")
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public Response transfer() {

    return Response.ok(repositoryTransfer.getList()).build();

  }

  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  public Response transferAccount(@HeaderParam("authorization") String token, @HeaderParam("opn-number") String operationNumber,TransferDto transfer) {

    return Response.ok(transfer).build();

  }


}
