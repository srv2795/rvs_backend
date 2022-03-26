package com.ashu.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "ANSWER")
public class Answer {

    @Id
    @Column(name = "answerId")
    private int answerId;

    @Column(name = "answer")
    private String answer;

    @OneToOne(mappedBy = "answer")
    private Question question;
}
