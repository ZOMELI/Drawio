package com.zomeli.services.cross.paymentexecution.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import lombok.Getter;

@Getter
@Entity(name = "TRANSFER_ACCOUNTS")
//@NamedQueries({
//    @NamedQuery(name = "Person.deleteByTransactionId", query = "delete from transfer p where p.id = ?1")
//})
//@NamedQueries({
//    @NamedQuery(name="AlumnosNombre", query="select a from TRANSFER_ACCOUNTS a where a.nombre=:nombre")
//})
public class TransferEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", columnDefinition="INT")
  private Integer id;

  @Column(name = "amount", columnDefinition="DECIMAL(11,2)", nullable = false)
  private Double amount;

  @Column(name = "currency", columnDefinition="VARCHAR(3)", nullable = false)
  private String currency;

  @Column(name = "accountIdOrigin", columnDefinition="VARCHAR(22)", nullable = false)
  private String accountIdOrigin;

  @Column(name = "currencyOrigin", columnDefinition="VARCHAR(3)", nullable = false)
  private String currencyOrigin;

  @Column(name = "amountOrigin", columnDefinition="DECIMAL(11,2)", nullable = false)
  private Double amountOrigin;

  @Column(name = "amountBalanceOrigin", columnDefinition="DECIMAL(11,2)", nullable = false)
  private Double amountBalanceOrigin;

  @Column(name = "amountAvailableOrigin", columnDefinition="DECIMAL(11,2)", nullable = false)
  private Double amountAvailableOrigin;

  @Column(name = "accountIdDestine", columnDefinition="VARCHAR(22)", nullable = false)
  private String accountIdDestine;

  @Column(name = "currencyDestine", columnDefinition="VARCHAR(3)", nullable = false)
  private String currencyDestine;

  @Column(name = "amountOriginDestine", columnDefinition="DECIMAL(11,2)", nullable = false)
  private Double amountOriginDestine;

  @Column(name = "amountBalanceOriginDestine", columnDefinition="DECIMAL(11,2)", nullable = false)
  private Double amountBalanceOriginDestine;

  @Column(name = "amountAvailableOriginDestine", columnDefinition="DECIMAL(11,2)", nullable = false)
  private Double amountAvailableOriginDestine;

  @Column(name = "description", columnDefinition="VARCHAR(255)", nullable = false)
  private String description;

  @Column(name="creationDate", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP", nullable = false)
  private Date creationDate;

}
