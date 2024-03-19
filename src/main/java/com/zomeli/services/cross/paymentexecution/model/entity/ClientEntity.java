package com.zomeli.services.cross.paymentexecution.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;
import java.util.List;
import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Cacheable
@Getter
@Entity(name = "PERSON")
@NamedQueries({
    @NamedQuery(name="Person.getById", query="SELECT a FROM PERSON a where a.personId = ?1")
})
public class ClientEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "personId", columnDefinition="INT")
  private Integer personId;

  @Column(name = "dni", columnDefinition="VARCHAR(8)", unique = true, nullable = false)
  private String dni;

  @Column(name = "name", columnDefinition="VARCHAR(50)", nullable = false)
  private String name;

  @Column(name="creationDate", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP", nullable = false)
  private Date creationDate;

  @OneToMany(fetch = FetchType.LAZY,
      cascade = CascadeType.ALL, orphanRemoval = true)
  @JsonIgnore
  private List<CustomerAccountEntity> customerAccountEntity;

}
