package com.zomeli.services.cross.paymentexecution.model.entity;


import java.util.Date;
import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Cacheable
@Getter
@Entity(name = "CUSTOMER_ACCOUNT")
@NamedQueries({
    @NamedQuery(name="CustomerAccount.getByAccountId", query="SELECT ca FROM CUSTOMER_ACCOUNT ca where ca.accountId = ?1")
})
public class CustomerAccountEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", columnDefinition="INT")
  private Integer id;

  @Column(name = "personId", columnDefinition="INT", nullable = false)
  private Integer personId;

  @Column(name = "accountId", columnDefinition="VARCHAR(22)", unique = true, nullable = true)
  private String accountId;

  @Column(name = "amount", columnDefinition="DECIMAL(11,2)", nullable = false)
  private Double amount;

  @Column(name = "currency", columnDefinition="VARCHAR(3)", nullable = true)
  private String currency;

  @Column(name="creationDate", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP", nullable = false)
  private Date creationDate;

  @ManyToOne(fetch = FetchType.LAZY)
  @MapsId("personId")
  @JoinColumn(name = "personId", foreignKey = @ForeignKey(name = "fk_person_id_person_table_person_id"))
  private ClientEntity clientEntity;

}
