package com.example.firstapp.firstapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Entry {

    @JsonProperty("API")
    private String api;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("Auth")
    private String auth;

    @JsonProperty("HTTPS")
    private Boolean https;

    @JsonProperty("Cors")
    private String cors;

    @JsonProperty("Link")
    private String link;

    @JsonProperty("Category")
    private String Category;

}
