package com.zomeli.services.cross.paymentexecution.repository;

import com.zomeli.services.cross.paymentexecution.model.entity.TransferEntity;
import java.util.List;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TransferRepository implements PanacheRepository<TransferEntity>{

  public TransferEntity findByTransaction(String id){
    return find("id", id).firstResult();
  }
  public List<TransferEntity> getList(){
    return listAll();
  }

  public long deleteTransaction(long id) {
    return delete("#Person.deleteByTransactionId", id);
  }

}
