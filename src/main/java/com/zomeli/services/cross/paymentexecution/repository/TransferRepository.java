package com.zomeli.services.cross.paymentexecution.repository;

import com.zomeli.services.cross.paymentexecution.entity.TransferEntity;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

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
