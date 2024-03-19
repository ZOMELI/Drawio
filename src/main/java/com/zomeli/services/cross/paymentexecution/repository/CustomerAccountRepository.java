package com.zomeli.services.cross.paymentexecution.repository;

import com.zomeli.services.cross.paymentexecution.model.entity.CustomerAccountEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import java.util.List;
import java.util.stream.Collectors;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CustomerAccountRepository implements PanacheRepository<CustomerAccountEntity> {

  public List<CustomerAccountEntity> findByAccountId(Integer id) {
    return find("#CustomerAccount.getByAccountId", id).stream()
        .collect(Collectors.toList());
  }

}
