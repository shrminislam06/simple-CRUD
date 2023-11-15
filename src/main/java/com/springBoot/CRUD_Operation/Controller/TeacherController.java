package com.springBoot.CRUD_Operation.Controller;
import com.springBoot.CRUD_Operation.Entity.Teacher;
import com.springBoot.CRUD_Operation.Model.UpdateTeacherModel;
import com.springBoot.CRUD_Operation.Service.TeacherService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/teacher")
public class TeacherController {
    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @GetMapping("/getAllTeacher")
    public List<Teacher> getAllTeacher() {
        return teacherService.getAllTeacher();
    }

    @PostMapping("/createTeacher")
    public Teacher createTeacher(@RequestBody Teacher teacher) {
        return teacherService.createTeacher(teacher);
    }

    @PutMapping("/updateTeacherInfo")
    public Teacher updateTeacherInfo(@RequestBody UpdateTeacherModel updateTeacherModel) {
        return teacherService.updateTeacherInfo(updateTeacherModel);
    }

    @DeleteMapping("/deleteById/{id}")
    public ResponseEntity<Boolean> deleteTeacherById(@PathVariable("id") int id) {
        return ResponseEntity.ok(teacherService.deleteTeacherById(id));
    }
}
