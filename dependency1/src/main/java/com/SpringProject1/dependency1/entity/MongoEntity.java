//package com.SpringProject1.dependency1.entity;
//
//import org.springframework.data.mongodb.core.mapping.Document;
//import org.springframework.data.mongodb.core.mapping.MongoId;
//
//import javax.persistence.*;
//import javax.validation.constraints.NotNull;
//import java.util.Collection;
//
//@Entity
//@Document("Student")
//public class MongoEntity {
//
//
//
//
//
//        @MongoId
//        @GeneratedValue(strategy = GenerationType.IDENTITY)
//        @Column(name = "id", nullable = false)
//        private Long id;
//        @NotNull(message = "Student name can not be empty")
//        private String fName;
//        private String lName;
//        private String branch;
//        private int departmentId;
//
//        public MongoEntity(Long id) {
//            this.id=id;
//        }
//
//        public String getfName() {
//            return fName;
//        }
//
//        public void setfName(String fName) {
//            this.fName = fName;
//        }
//
//        public String getlName() {
//            return lName;
//        }
//
//        public void setlName(String lName) {
//            this.lName = lName;
//        }
//
//        public String getBranch() {
//            return branch;
//        }
//
//        public void setBranch(String branch) {
//            this.branch = branch;
//        }
//
//        public Integer getDepartmentId() {
//            return departmentId;
//        }
//
//        public void setDepartmentId(int departmentId) {
//            this.departmentId = departmentId;
//        }
//
//
//
//
//
//        public Long getId(){return id;}
//        public void setId(Long id){this.id = id;}
//
//    }
//
//
