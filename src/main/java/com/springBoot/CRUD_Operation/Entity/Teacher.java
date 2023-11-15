package com.springBoot.CRUD_Operation.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Teacher {
    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private long teacherId;
    private String teacherName;



}
