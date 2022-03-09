package com.SpringProject1.dependency1.service;

import com.SpringProject1.dependency1.dto.Student;
import org.springframework.stereotype.Service;
import com.SpringProject1.dependency1.*;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();
    List<Student> getpgstudents();
    List<Student> getMgstudents();
    List<Student> getredisstudents();
    void addpgStudent(Student student);
    void addMgstudent(Student student);
    void addredisStudent(Student student);

    Student getStudent(Integer id);
    void addStudent(Student student);
    Student updatingStudent(Student student);
    void DeleteStudent(Integer id);
}
