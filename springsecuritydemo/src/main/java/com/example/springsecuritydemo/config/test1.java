package com.example.springsecuritydemo.config;

import com.fasterxml.jackson.annotation.JsonAlias;
import org.json.JSONObject;

import java.util.Base64;

public class test1 {
    public static void main(String[] args) {
        String token = "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhc2h1IiwiaWF0IjoxNzAxODAyMzI2LCJleHAiOjE3MDE4MDIzMjl9.b84cfzq-cylml_NEr8GghaWkfe4wROwoG6yxPQm2prQ";
        String[] strArray = token.split("\\.");
        Base64.Decoder decoder = Base64.getUrlDecoder();
        String header = new String(decoder.decode(strArray[0]));
        String payload = new String(decoder.decode(strArray[1]));
        System.out.println("header : "+ header);
        System.out.println("payload : "+ payload);
        JSONObject js = new JSONObject(payload);
        String username = js.get("sub").toString();
        System.out.println("username : " + username);
    }
}
