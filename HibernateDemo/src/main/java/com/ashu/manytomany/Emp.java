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
@Table(name = "EMPLOYEE")
public class Emp {
    @Id
    @Column(name = "EMPLOYEE_ID")
    private int empId;
    @Column(name = "EMPLOYEE_NAME")
    private String empName;

    @ManyToMany(mappedBy = "employees")
    private List<Proj> projects;
}
