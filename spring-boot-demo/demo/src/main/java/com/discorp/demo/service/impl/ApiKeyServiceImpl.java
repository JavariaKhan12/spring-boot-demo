package com.discorp.demo.service.impl;

import com.discorp.demo.model.ApiKeyModel;
import com.discorp.demo.repositories.ApiKeyRepository;
import com.discorp.demo.service.ApiKeyService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import javax.transaction.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class ApiKeyServiceImpl implements ApiKeyService
{
    @NonNull ApiKeyRepository apiKeyRepository;
    @Override
    public ApiKeyModel getApiKey(String key)
    {
        return apiKeyRepository.findByAuthKey(key).map(ApiKeyModel::new)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

}
