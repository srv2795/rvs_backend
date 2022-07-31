package com.example.firstapp.firstapp.services.impl;

import com.example.firstapp.firstapp.model.ApiInfo;
import com.example.firstapp.firstapp.services.ApiInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApiInfoServiceImpl implements ApiInfoService {
    private static final String API_URL = "https://api.publicapis.org/entries";

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public ApiInfo getApiInfo() {
        ResponseEntity<ApiInfo> responseEntity = restTemplate.getForEntity(API_URL, ApiInfo.class);
        return responseEntity.getBody();
    }
}
