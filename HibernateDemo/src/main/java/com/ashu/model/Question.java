package com.ashu.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "QUESTION")
public class Question {

    @Id
    @Column(name = "questionId")
    private int questionId;

    private String question;

    @OneToOne
    @JoinColumn(name = "a_id")
    private Answer answer;

}
