package com.springBoot.CRUD_Operation.Service.ServiceIMPL;

import com.springBoot.CRUD_Operation.Entity.Student;
import com.springBoot.CRUD_Operation.Entity.Teacher;
import com.springBoot.CRUD_Operation.Model.AddStudentModel;
import com.springBoot.CRUD_Operation.Model.UpdateStudentModel;
import com.springBoot.CRUD_Operation.Repository.StudentRepositoy;
import com.springBoot.CRUD_Operation.Repository.TeacherRepository;
import com.springBoot.CRUD_Operation.Service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class StudentServiceIMPL implements StudentService {
    private final StudentRepositoy studentRepositoy;
    private final TeacherRepository teacherRepository;

    public StudentServiceIMPL(StudentRepositoy studentRepositoy, TeacherRepository teacherRepository) {
        this.studentRepositoy = studentRepositoy;
        this.teacherRepository = teacherRepository;
    }

    @Override
    public Student createStudent(AddStudentModel addStudentModel) {

        Teacher teacher = teacherRepository.findById(addStudentModel.getTeacherId())
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "teacher's id not found" + addStudentModel.getTeacherId()));
        Student student = new Student();
        student.setId(addStudentModel.getId());
        student.setStd_id(addStudentModel.getStd_id());
        student.setStudentName(addStudentModel.getStudentName());
        student.setSemester(addStudentModel.getSemester());
        student.setSession(addStudentModel.getSession());
        student.setTeacher(teacher);
        studentRepositoy.save(student);
        return student;

    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepositoy.findAll();
    }

    @Override
    public Student updateStudent(UpdateStudentModel updateStudentModel) {
        Student student = studentRepositoy.findById(updateStudentModel.getId())
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, " student's id not found" + updateStudentModel.getId()));
        student.setStd_id(updateStudentModel.getStd_id());
        student.setStudentName(updateStudentModel.getStudentName());
        student.setSemester(updateStudentModel.getSemester());
        student.setSession(updateStudentModel.getSession());
        return studentRepositoy.save(student);
    }

    @Override
    public Boolean deleteStudentById(int id) {
        studentRepositoy.deleteById(id);
        return true;

    }
}
