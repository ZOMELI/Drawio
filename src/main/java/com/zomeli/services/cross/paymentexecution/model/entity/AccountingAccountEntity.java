package com.zomeli.services.cross.paymentexecution.model.entity;


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "ACCOUNTING_ACCOUNT")
@NamedQueries({
    @NamedQuery(name="AccountingAccount.getByAccountId", query="SELECT aa FROM ACCOUNTING_ACCOUNT aa where aa.accountId = ?1")
})
public class AccountingAccountEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", columnDefinition="INT")
  private Integer id;

  @Column(name = "accountId", columnDefinition="VARCHAR(22)", unique = true, nullable = false)
  private String accountId;

  @Column(name = "amount", columnDefinition="DECIMAL(11,2)", nullable = false)
  private Double amount;

  @Column(name = "currency", columnDefinition="VARCHAR(3)", nullable = false)
  private String currency;

  @Column(name="creationDate", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP", nullable = false)
  private Date creationDate;

}
