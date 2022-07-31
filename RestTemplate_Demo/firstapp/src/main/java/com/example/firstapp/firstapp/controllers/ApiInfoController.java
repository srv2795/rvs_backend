package com.example.firstapp.firstapp.controllers;

import com.example.firstapp.firstapp.model.ApiInfo;
import com.example.firstapp.firstapp.services.ApiInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api/external/")
public class ApiInfoController {

    @Autowired
    private ApiInfoService apiInfoService;

    //https://api.publicapis.org/entries
    @GetMapping("/apiInfo")
    public ApiInfo getApiInfo() {
        return apiInfoService.getApiInfo();
    }
}