package com.ashu.onetomany;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "ACCOUNT")
public class Account {

    @Id
    @Column(name = "ACCOUNT_NO")
    private int accountNo;
    @Column(name = "BANK_NAME")
    private String bankName;

    @ManyToOne
    private Person person;
}
