package com.discorp.demo.controller;

import com.discorp.demo.domain.Tax;
import com.discorp.demo.model.ApiKeyModel;
import com.discorp.demo.model.TaxModel;
import com.discorp.demo.service.ApiKeyService;
import com.discorp.demo.service.TaxService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController
{
    private ApiKeyService apiKeyService;
    private TaxService taxService;

    public TestController(ApiKeyService apiKeyService, TaxService taxService)
    {
        this.apiKeyService = apiKeyService;
        this.taxService = taxService;
    }

    @GetMapping("/greeting")
    public ResponseEntity<String> greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return ResponseEntity.ok("hello " + name);
    }

    @GetMapping(value = "/authkey/{key}")
    public ResponseEntity<ApiKeyModel> get(@PathVariable String key) {
        return ResponseEntity.ok(apiKeyService.getApiKey(key));
    }

    @GetMapping(value = "/checkTax/{tax}")
    public ResponseEntity<TaxModel> getModel(@PathVariable Long tax)
    {
        return ResponseEntity.ok(taxService.getTax(tax));
    }
}
