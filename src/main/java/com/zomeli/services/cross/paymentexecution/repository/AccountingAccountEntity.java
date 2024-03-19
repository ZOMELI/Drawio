package com.zomeli.services.cross.paymentexecution.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import java.util.List;
import java.util.stream.Collectors;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AccountingAccountEntity implements PanacheRepository<AccountingAccountEntity> {

  public List<AccountingAccountEntity> findByAccountId(Integer id) {
    return find("#AccountingAccount.getByAccountId", id).stream()
        .collect(Collectors.toList());
  }
}
