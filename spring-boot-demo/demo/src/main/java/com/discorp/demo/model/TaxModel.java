package com.discorp.demo.model;

import com.discorp.demo.domain.Tax;
import lombok.Data;

@Data
public class TaxModel {
    private Long value;
    private String type;
    private Long webId;


    public TaxModel(Tax model)
    {
        this.value = model.getValue();
        this.type = model.getType();
        this.webId = model.getWebId();

    }
}
