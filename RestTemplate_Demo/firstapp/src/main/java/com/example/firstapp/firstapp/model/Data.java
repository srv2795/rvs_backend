package com.example.firstapp.firstapp.model;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
@EqualsAndHashCode
public class Data {
    private String iso2;
    private String iso3;
    private String country;
    private List<String> cities;
}