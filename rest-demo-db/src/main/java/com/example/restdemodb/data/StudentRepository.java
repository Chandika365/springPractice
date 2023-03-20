/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.restdemodb.data;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author chandika
 */
//import @Repository
@Repository 
public interface StudentRepository extends JpaRepository<Student,Integer /*data type of primary key*/>{
    
    @Query("select st from Student st where st.name=?1")
    List<Student> findUserByName (String name);
    
    @Query ("select st from Student st where st.age = ?1")
    List<Student> findUserByAge (int age);
    
    @Query("select st from Student st where st.name=?1 and st.age=?2")
    List<Student> findUserByNameAndAge (String name, int age);
}
