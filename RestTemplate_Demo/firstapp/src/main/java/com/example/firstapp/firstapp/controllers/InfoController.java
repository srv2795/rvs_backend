package com.example.firstapp.firstapp.controllers;

import com.example.firstapp.firstapp.model.Information;
import com.example.firstapp.firstapp.services.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api/info")
public class InfoController {

//https://countriesnow.space/api/v0.1/countries
//https://countriesnow.space/api/v0.1/countries/population/cities

    @Autowired
    private InfoService infoService;

    @GetMapping("/country-info")
    public Information getInformation() {
        Information info = infoService.getCountryInfo();
        return info;
    }
}
