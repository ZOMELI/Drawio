package com.zomeli.services.cross.paymentexecution.activity;

import com.zomeli.services.cross.paymentexecution.model.generate.MoneyTransferRequest;
import com.zomeli.services.cross.paymentexecution.proxy.MockClient;
import io.quarkus.temporal.runtime.annotations.TemporalActivity;
import javax.inject.Inject;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.logging.Logger;
import org.jboss.logmanager.MDC;

@TemporalActivity(name = "AccountTransferExecutionActivity")
public class AccountTransferExecutionActivityImpl implements AccountTransferExecutionActivity{
  private static final Logger log = Logger.getLogger(AccountTransferExecutionActivityImpl.class);

  @Inject
  @RestClient
  MockClient mockClient;

//    @Inject
//    @RestClient
//    ServiceClient clientService;

  @Override
  public String withdraw(String uuid, MoneyTransferRequest transferRequest) {
    MDC.put("request.id", uuid);

    String data = mockClient.getMock(MoneyTransferRequest.builder()
//        .account("194333132")
        .build());

    log.info(data);
    return "withdraw";
  }

  @Override
  public String deposit(String uuid, MoneyTransferRequest transferRequest) {

//    String data = clientService.getPokemon("pikachu");
//    log.info(data);
    return "deposit";
  }

  @Override
  public String withdrawExtortion(String uuid, MoneyTransferRequest transferRequest) {
    return "withdrawExtortion";
  }

  @Override
  public String depositExtortion(String uuid, MoneyTransferRequest transferRequest) {
    return "depositExtortion";
  }
}
