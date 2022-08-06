package com.example.firstapp.firstapp.controllers;

import com.example.firstapp.firstapp.services.WeatherInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/v1/api/weather")
public class WeatherController {

    @Autowired
    private WeatherInfo weatherInfo;

    //     localhost:8082/v1/api/weather/forcast/Delhi/4/2022-08-06
    @GetMapping("/forcast/{location}/{days}/{date}")
    public String getWeatherInfo(@PathVariable String location, @PathVariable Integer days, @PathVariable String date) {
        String forcastInfo = weatherInfo.getWeatherForCast(location, days, date);
        return forcastInfo;
    }
}
