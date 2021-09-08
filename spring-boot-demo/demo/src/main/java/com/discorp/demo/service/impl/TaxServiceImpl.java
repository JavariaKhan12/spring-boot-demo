package com.discorp.demo.service.impl;

import com.discorp.demo.model.ApiKeyModel;
import com.discorp.demo.model.TaxModel;
import com.discorp.demo.repositories.TaxRepository;
import com.discorp.demo.service.TaxService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
@Service
@RequiredArgsConstructor
public class TaxServiceImpl implements TaxService {

    @NonNull private TaxRepository taxRepository;
    @Override
    public TaxModel getTax(Long tax) {
        return taxRepository.findById(tax).map(TaxModel::new)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));

    }

}
