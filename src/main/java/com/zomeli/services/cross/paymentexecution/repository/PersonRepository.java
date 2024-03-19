package com.zomeli.services.cross.paymentexecution.repository;

import com.zomeli.services.cross.paymentexecution.model.entity.ClientEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import java.util.List;
import java.util.stream.Collectors;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PersonRepository implements PanacheRepository<ClientEntity> {

  public List<ClientEntity> findByPersonId(Integer id) {
    return find("#Person.getById", id).stream()
        .collect(Collectors.toList());
  }
}
