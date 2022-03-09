package com.SpringProject1.dependency1.repository;

import com.*;
import com.SpringProject1.dependency1.dto.Student;
//import com.SpringProject1.dependency1.entity.MongoEntity;
import com.SpringProject1.dependency1.entity.StudentEntity;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<StudentEntity,Integer> {

}
