/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.restdemodb.controller;

import com.example.restdemodb.data.Student;
import com.example.restdemodb.service.StudentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author chandika
 */
@RestController
public class StudentController {
    
    @Autowired
    private StudentService studentService;
    
    @GetMapping(path = "/students")
    public List<Student> getAllStudent(){
        
       return studentService.getAllStudent();   
    }
    @GetMapping(path = "/students/{id}")
     public Student getStudentById(@PathVariable int id){
         return studentService.getStudentById(id);
    }
     @PostMapping(path = "/students")
     public Student createStudent(@RequestBody Student student){
         return studentService.createStudent(student);
     }
     
     @PutMapping(path ="/students")
     public Student updateStudent(@RequestBody Student stu){
         return studentService.updateStudent(stu);
     }
     
     @DeleteMapping(path = "/students/{id}")
     public void deleteStudentById(@PathVariable int id){
         studentService.deleteStudentById(id);
     }
     
     @GetMapping(path = "/students", params = "name")
     public List<Student> findUserByName(@RequestParam String name){
         return studentService.findUserByName(name);
     }
     
     @GetMapping(path = "/students", params = "age")
     public List<Student> findUserByAge(@RequestParam int age){
         return studentService.findUserByAge(age);
     }
     
     @GetMapping(path = "/students", params = "name, age")
     public List<Student> findUserByNameAndAge(@RequestParam String name, int age){
         return studentService.findUserByNameAndAge(name, age);
     }
     
     
}
