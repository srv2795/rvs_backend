package com.example.firstapp.firstapp.model;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class Information {
    private String error;
    private String msg;
    private List<Data> data;
}
