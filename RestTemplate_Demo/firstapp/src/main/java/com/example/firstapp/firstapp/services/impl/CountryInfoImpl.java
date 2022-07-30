package com.example.firstapp.firstapp.services.impl;

import com.example.firstapp.firstapp.model.Information;
import com.example.firstapp.firstapp.services.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
public class CountryInfoImpl implements InfoService {

    private static final String COUNTRIES_URL = "https://countriesnow.space/api/v0.1/countries";

    @Override
    public Information getCountryInfo() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Information> responseEntity = restTemplate.getForEntity(COUNTRIES_URL, Information.class);
        Optional<Information> information = Optional.ofNullable(responseEntity.getBody());
        return information.get();
    }
}
