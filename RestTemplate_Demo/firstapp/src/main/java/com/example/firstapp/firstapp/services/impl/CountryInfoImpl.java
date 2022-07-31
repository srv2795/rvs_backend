package com.example.firstapp.firstapp.services.impl;

import com.example.firstapp.firstapp.exception.CountryNotFoundInfo;
import com.example.firstapp.firstapp.model.Data;
import com.example.firstapp.firstapp.model.Information;
import com.example.firstapp.firstapp.services.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Service
public class CountryInfoImpl implements InfoService {

    private static final String COUNTRIES_URL = "https://countriesnow.space/api/v0.1/countries";

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public Information getCountryInfo() {
        ResponseEntity<Information> responseEntity = restTemplate.getForEntity(COUNTRIES_URL, Information.class);
        Optional<Information> information = Optional.ofNullable(responseEntity.getBody());
        return information.get();
    }

    @Override
    public Data getCountryInfoByCode(String countryCode) throws CountryNotFoundInfo {
        Data countryInformation = null;
        ResponseEntity<Information> responseEntity = restTemplate.getForEntity(COUNTRIES_URL, Information.class);
        Optional<Information> information = Optional.ofNullable(responseEntity.getBody());
        Optional<List<Data>> dataList = Optional.ofNullable(information.get().getData());
        Iterator<Data> itr = dataList.get().iterator();
        while(itr.hasNext()) {
            Data countryData = itr.next();
            if (countryCode.equals(countryData.getIso2())) {
                countryInformation = countryData;
                break;
            }
        }
        return countryInformation;
    }
}
