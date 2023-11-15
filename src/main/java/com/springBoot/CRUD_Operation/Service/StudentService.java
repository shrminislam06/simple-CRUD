package com.springBoot.CRUD_Operation.Service;

import com.springBoot.CRUD_Operation.Entity.Student;
import com.springBoot.CRUD_Operation.Model.AddStudentModel;
import com.springBoot.CRUD_Operation.Model.UpdateStudentModel;

import java.util.List;

public interface StudentService {
   

    List<Student> getAllStudents();

    Student updateStudent(UpdateStudentModel updateStudentModel);

    Boolean deleteStudentById(int id);

    Student createStudent(AddStudentModel addStudentModel);
}
