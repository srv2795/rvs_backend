package com.example.springsecuritydemo.service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.json.JSONObject;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class JwtService {

    public String generateToken(String username) {
        Map<String, Object> claims = new HashMap();
        return createToken(claims, username);
    }

    private String createToken(Map<String, Object> claims, String username) {
        return Jwts.builder()
                .setClaims(claims)
                .setSubject(username)
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + 1000 + 60 * 30))
                .signWith(getSignKey(), SignatureAlgorithm.HS256)
                .compact();
    }

    private Key getSignKey() {
        byte[] keySecret = Decoders.BASE64.decode("zcYwk+vEstTcKva1HFeGkHLztqAhBH+9tc+jtCpNBAfa9bOh0OEBxnW0m3Tw+Oph");
        return Keys.hmacShaKeyFor(keySecret);
    }

    public String getUserName(String token) {
        String[] strArray = token.split("\\.");
        Base64.Decoder decoder = Base64.getUrlDecoder();
        String header = new String(decoder.decode(strArray[0]));
        String payload = new String(decoder.decode(strArray[1]));
        System.out.println("header : "+ header);
        System.out.println("payload : "+ payload);
        JSONObject js = new JSONObject(payload);
        return js.get("sub").toString();
    }
}
