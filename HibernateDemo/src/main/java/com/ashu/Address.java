package com.ashu;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name="student_Address")
public class Address {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="address_id")
    private int address_id;
    private String street;
    @Column(length=50, name="streetAddr")
    private String city;
    @Column(name="flag")
    private boolean isOpen;
    @Transient
    private double x;
    @Temporal(TemporalType.DATE)
    private Date addedDate;
    @Lob
    private byte[] image;

}
