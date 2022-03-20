package com.ashu.manytomany;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "PROJECT")
public class Proj {
    @Id
    @Column(name = "PROJECT_ID")
    private int projId;
    @Column(name = "PROJECT_NAME")
    private String projName;

    @ManyToMany
    @JoinTable(name = "EMP_PROJ",
            joinColumns ={@JoinColumn(name = "EMP_ID")},
            inverseJoinColumns = {@JoinColumn(name = "PROJ_ID")})
    private List<Emp> employees;
}
