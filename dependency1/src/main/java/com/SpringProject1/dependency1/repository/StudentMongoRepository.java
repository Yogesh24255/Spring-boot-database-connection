package com.SpringProject1.dependency1.repository;


//import com.example.demo.entity.StudentEntity;
//import com.example.demo.entity.StudentMongo;
import com.SpringProject1.dependency1.entity.StudentEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentMongoRepository extends MongoRepository<StudentEntity, Integer> {

}
