package com.springBoot.CRUD_Operation.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Student {
    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private long std_id;
    private String studentName;
    private String semester;
    private String session;
    @ManyToOne
    private Teacher teacher;
}
