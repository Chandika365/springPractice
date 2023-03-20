/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.restdemodb.service;

import com.example.restdemodb.data.Student;
import com.example.restdemodb.data.StudentRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author chandika
 */
//this class will service class with @service
@Service
public class StudentService {
    
//    dependency injection
    @Autowired
    private StudentRepository studentRepository;
    
    public List<Student> getAllStudent(){
        List<Student> students = studentRepository.findAll();
        return students;
    }
    
    public Student getStudentById(int id){
       Optional<Student>stu = studentRepository.findById(id);      
        return stu.get();
    }
//    new method for student object
    
    public Student createStudent(Student stu){
        return studentRepository.save(stu);
//     studentRepository.save(stu); means we create new user example,we create new student in database with .save(stu)
    }
    
    public Student updateStudent(Student stu){
        return studentRepository.save(stu);//update and create new user both use same .save
    }
    
    public void deleteStudentById(int id){
        studentRepository.deleteById(id);
    }

    public List<Student> findUserByName(String name){
        List<Student> st = studentRepository.findUserByName(name);
        return st;
    }
    
   public List<Student> findUserByAge (int age){
       List<Student>st=studentRepository.findUserByAge(age);
       return st;
   }
   
   public List<Student> findUserByNameAndAge (String name,int age){
       List<Student>st=studentRepository.findUserByNameAndAge(name, age);
       return st;
   }
    
}
