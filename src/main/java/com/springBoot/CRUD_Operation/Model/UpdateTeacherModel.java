package com.springBoot.CRUD_Operation.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UpdateTeacherModel {
    private int id;
    private long teacherId;
    private String teacherName;


}
