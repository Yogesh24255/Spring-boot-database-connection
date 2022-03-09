package com.SpringProject1.dependency1.service;


import com.SpringProject1.dependency1.dto.Student;
import com.SpringProject1.dependency1.entity.StudentEntity;
import com.SpringProject1.dependency1.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
class StudentServiceImpl implements StudentService {

    @Autowired
    Studentdb studentdb;

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    StudentRedisRepository studentRedisRepository;

    @Autowired
    StudentMongoRepository studentMongoRepository;

    @Override
    public List<Student> getAllStudents() {
        List<Student> s = new ArrayList<>();
        for (StudentEntity student : studentMongoRepository.findAll()) {
            Student s1 = new Student();
            s1.setId(student.getId());
            s1.setPname(student.getPname());
            s1.setLname(student.getLname());
            s1.setBranch(student.getBranch());
            s.add(s1);
        }
        for (StudentEntity student : studentRepository.findAll()) {
            Student s1 = new Student();
            s1.setId(student.getId());
            s1.setPname(student.getPname());
            s1.setLname(student.getLname());
            s1.setBranch(student.getBranch());
            s.add(s1);
        }
        for (Student student : studentRedisRepository.findAll()) {
            Student s1 = new Student();
            s1.setId(student.getId());
            s1.setPname(student.getPname());
            s1.setLname(student.getLname());
            s1.setBranch(student.getBranch());
            s.add(s1);
        }
        return s;
    }

    @Override
    public Student getStudent(Integer id) {
        Student o = new Student();
        for (StudentEntity student : studentMongoRepository.findAll()) {
            if (student.getId() == id) {
                o.setId(student.getId());
                o.setPname(student.getPname());
                o.setLname(student.getLname());
                o.setBranch(student.getBranch());
                break;
            }
        }
        return o;
    }

    @Override
    public void addStudent(Student student) {
        StudentEntity se = new StudentEntity();
        se.setId(student.getId());
        se.setBranch(student.getBranch());
        se.setPname(student.getPname());
        se.setLname(student.getLname());
        studentMongoRepository.save(new StudentEntity(se.getId(), se.getPname(), se.getLname(), se.getBranch()));

    }

    @Override
    public Student updatingStudent(Student student) {
        Student so = new Student();
        for (StudentEntity se : studentMongoRepository.findAll()) {
            if (se.getId() == student.getId()) {
                se.setPname(student.getPname());
                studentMongoRepository.save(new StudentEntity(se.getId(), se.getPname(), se.getLname(), se.getBranch()));
                so.setId(se.getId());
                so.setBranch(se.getBranch());
                so.setPname(se.getPname());
                so.setLname(se.getLname());
            }
        }
        return so;
    }

    @Override
    public void DeleteStudent(Integer id) {
        for (StudentEntity stu : studentMongoRepository.findAll()) {
            if (stu.getId() == id) {
                studentMongoRepository.deleteById(id);
                break;
            }
        }

    }

    @Override
    public void addpgStudent(Student student) {
        StudentEntity se = new StudentEntity();
        se.setId(student.getId());
        se.setBranch(student.getBranch());
        se.setPname(student.getPname());
        se.setLname(student.getLname());
        studentRepository.save(new StudentEntity(se.getId(), se.getPname(), se.getLname(), se.getBranch()));
    }

    @Override
    public void addMgstudent(Student student) {
        StudentEntity se = new StudentEntity();
        se.setId(student.getId());
        se.setBranch(student.getBranch());
        se.setPname(student.getPname());
        se.setLname(student.getLname());
        studentMongoRepository.save(new StudentEntity(se.getId(), se.getPname(), se.getLname(), se.getBranch()));
    }

    @Override
    public void addredisStudent(Student student) {
        studentRedisRepository.addOne(student);

    }

    @Override
    public List<Student> getpgstudents() {
        List<Student> s = new ArrayList<>();
        for (StudentEntity student : studentRepository.findAll()) {
            Student s1 = new Student();
            s1.setId(student.getId());
            s1.setPname(student.getPname());
            s1.setLname(student.getLname());
            s1.setBranch(student.getBranch());
            s.add(s1);
        }
        return s;
    }

    @Override
    public List<Student> getMgstudents() {
        List<Student> s = new ArrayList<>();
        for (StudentEntity student : studentMongoRepository.findAll()) {
            Student s1 = new Student();
            s1.setId(student.getId());
            s1.setPname(student.getPname());
            s1.setLname(student.getLname());
            s1.setBranch(student.getBranch());
            s.add(s1);
        }
        return s;
    }

    @Override
    public List<Student> getredisstudents() {
        return studentRedisRepository.findAll();
    }


}
