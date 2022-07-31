package com.example.firstapp.firstapp.services;

import com.example.firstapp.firstapp.exception.CountryNotFoundInfo;
import com.example.firstapp.firstapp.model.Data;
import com.example.firstapp.firstapp.model.Information;

public interface InfoService {

    public Information getCountryInfo();

    public Data getCountryInfoByCode(String countryCode) throws CountryNotFoundInfo;


}
