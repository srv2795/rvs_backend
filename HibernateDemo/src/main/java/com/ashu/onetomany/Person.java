package com.ashu.onetomany;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "PERSON")
public class Person {

    @Id
    @Column(name = "USER_ID")
    private int userId;
    @Column(name = "USERNAME")
    private String username;

    @OneToMany(mappedBy = "person")
    private List<Account> accounts;
}
