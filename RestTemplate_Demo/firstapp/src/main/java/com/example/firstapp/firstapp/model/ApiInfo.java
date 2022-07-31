package com.example.firstapp.firstapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class ApiInfo {
    private Integer count;

    @JsonProperty("entries")
    private List<Entry> entries;
}
