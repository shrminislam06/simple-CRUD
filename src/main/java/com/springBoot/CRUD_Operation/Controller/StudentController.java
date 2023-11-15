package com.springBoot.CRUD_Operation.Controller;
import com.springBoot.CRUD_Operation.Entity.Student;
import com.springBoot.CRUD_Operation.Model.AddStudentModel;
import com.springBoot.CRUD_Operation.Model.UpdateStudentModel;
import com.springBoot.CRUD_Operation.Service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/student")
public class StudentController {
    private  StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/createStudent")
    public ResponseEntity<Student> createStudent(@RequestBody AddStudentModel addStudentModel) {
        return ResponseEntity.ok(studentService.createStudent(addStudentModel));
    }

    @GetMapping("/getAllStudents")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PutMapping("/updateStudent")
    public Student updateStudent(@RequestBody UpdateStudentModel updateStudentModel) {
        return studentService.updateStudent(updateStudentModel);
    }

    @DeleteMapping("/deleteStudentById/{id}")
    public ResponseEntity<Boolean> deleteStudentById(@PathVariable("id") int id) {
        return ResponseEntity.ok(studentService.deleteStudentById(id));

    }

}
