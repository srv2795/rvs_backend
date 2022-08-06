package com.example.firstapp.firstapp.services.impl;

import com.example.firstapp.firstapp.services.WeatherInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherInfoImpl implements WeatherInfo {

    public static final String BASE_URL= "http://api.weatherapi.com/v1/forecast.json";

    @Value("${api_key}")
    public String API_KEY;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public String getWeatherForCast(String loc, Integer total_days, String date) {

        String complete_url = BASE_URL+"?key="+API_KEY+"&q="+loc+"&days="+total_days+"&dt="+date;
        /*HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setBearerAuth(API_KEY);
        HttpEntity<String> entity = new HttpEntity<>(headers);*/
        //ResponseEntity<String> responseEntity = restTemplate.exchange(complete_url, HttpMethod.GET, entity, String.class);
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(complete_url, String.class);
        //String response = restTemplate.getForObject(complete_url, String.class);

        return responseEntity.getBody();
    }

}
