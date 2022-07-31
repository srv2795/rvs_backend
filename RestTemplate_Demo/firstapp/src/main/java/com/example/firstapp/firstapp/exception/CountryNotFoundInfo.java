package com.example.firstapp.firstapp.exception;

public class CountryNotFoundInfo extends Throwable {

    public String getCountryNotFoundException() {
        return "Sorry, This country is not present in the list.";
    }
}
