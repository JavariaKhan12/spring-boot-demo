package com.discorp.demo.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "api_key")
@Data
public class ApiKey  extends AuditableEntity implements Serializable
{
  private String authKey;
  private Long enterpriseId;
  private String disabled;
  private Integer version;
  private Date dateUpdated;
  private Date dateCreated;
}
