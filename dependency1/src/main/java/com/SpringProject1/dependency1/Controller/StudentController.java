package com.SpringProject1.dependency1.Controller;
import com.SpringProject1.dependency1.*;
import com.SpringProject1.dependency1.dto.Student;
import com.SpringProject1.dependency1.entity.StudentEntity;

import com.SpringProject1.dependency1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.aggregation.ConditionalOperators;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService ss;


    @GetMapping("/Students")
    public List<Student> getAllStudent(@RequestParam String db){
        switch(db){
            case "pg":
                return ss.getpgstudents();
            case "redis":
                return ss.getredisstudents();
            case "mg":
                return ss.getMgstudents();
            default:
                return ss.getAllStudents();
        }
    }


    @GetMapping("/Student")
    public Student getStudent(@RequestParam(required = true) Integer id){
        return ss.getStudent(id);
    }

    @PostMapping("/Stud")
    public void addStudent(@RequestBody @Valid Student student,@RequestParam String db){
        switch(db){
            case "pg":
                ss.addpgStudent(student);
                break;
            case "redis":
                ss.addredisStudent(student);
                break;
            case "mg":
                ss.addMgstudent(student);
                break;
            default:
                ss.addStudent(student);

        }
    }

    @PutMapping("/St")
    public void putStudent(@RequestBody Student student){
        ss.updatingStudent(student);
    }

    @DeleteMapping("/S")
    public void deleteStudent(@RequestParam(value ="id") Integer id){
        ss.DeleteStudent(id);
    }
}
