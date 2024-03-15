package com.zomeli.services.cross.paymentexecution.controller;

import com.zomeli.services.cross.paymentexecution.repository.TransferRepository;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
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


}
