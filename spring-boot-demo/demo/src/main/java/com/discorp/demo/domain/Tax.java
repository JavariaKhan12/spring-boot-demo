package com.discorp.demo.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "tax")
@Data
public class Tax extends AuditableEntity implements Serializable {
    private Long value;
    private String type;
}
