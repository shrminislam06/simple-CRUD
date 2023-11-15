package com.springBoot.CRUD_Operation.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UpdateStudentModel {
    private int id;
    private long std_id;
    private String studentName;
    private String semester;
    private String session;

}
