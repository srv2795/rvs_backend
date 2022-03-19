package com.ashu;

import lombok.*;

import javax.persistence.Embeddable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Embeddable
public class Teacher {
    private String tutorId;
    private String teacherName;
}
