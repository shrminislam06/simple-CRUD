package com.springBoot.CRUD_Operation.Service;

import com.springBoot.CRUD_Operation.Entity.Teacher;
import com.springBoot.CRUD_Operation.Model.AddTeacher;
import com.springBoot.CRUD_Operation.Model.UpdateTeacherModel;

import java.util.List;

public interface TeacherService {
    List<Teacher> getAllTeacher();


    Teacher createTeacher(Teacher addTeacher);

    Teacher updateTeacherInfo(UpdateTeacherModel updateTeacherModel);

    Boolean deleteTeacherById(int id);
}
