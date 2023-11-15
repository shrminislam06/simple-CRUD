package com.springBoot.CRUD_Operation.Service.ServiceIMPL;
import com.springBoot.CRUD_Operation.Entity.Teacher;
import com.springBoot.CRUD_Operation.Model.UpdateTeacherModel;
import com.springBoot.CRUD_Operation.Repository.TeacherRepository;
import com.springBoot.CRUD_Operation.Service.TeacherService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;
@Service
public class TeacherServiceIMPL implements TeacherService {
    private final TeacherRepository teacherRepository;

    public TeacherServiceIMPL(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public List<Teacher> getAllTeacher() {
        return teacherRepository.findAll();
    }

    @Override
    public Teacher createTeacher(Teacher addTeacher) {
        return teacherRepository.save(addTeacher);


    }

    @Override
    public Teacher updateTeacherInfo(UpdateTeacherModel updateTeacherModel) {
        Teacher teacher = teacherRepository.findById(updateTeacherModel.getId())
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "teacher's id not found" + updateTeacherModel.getId()));
        teacher.setTeacherId(updateTeacherModel.getTeacherId());
        teacher.setTeacherName(updateTeacherModel.getTeacherName());
        teacherRepository.save(teacher);
        return teacher;
    }

    @Override
    public Boolean deleteTeacherById(int id) {
        teacherRepository.deleteById(id);
        return true;
    }


}
