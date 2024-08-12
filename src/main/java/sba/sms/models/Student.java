package sba.sms.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;


/**
 * Student is a POJO, configured as a persistent class that represents (or maps to) a table
 * name 'student' in the database. A Student object contains fields that represent student
 * login credentials and a join table containing a registered student's email and course(s)
 * data. The Student class can be viewed as the owner of the bi-directional relationship.
 * Implement Lombok annotations to eliminate boilerplate code.
 */

//Define the table
    @Setter
    @Getter
    @Entity
    @Table(name = "Student")

    public class Student {

@Id
    @Column(name = "email",length = 50,unique = true,nullable = true)
    private String email;

@Column(name = "name", length = 50, nullable = true)
    private String name;

@Column (name = "password", length = 50, nullable = true)
    private String password;

  @Column(name = "course")
    private Set<Course> courses;
//    fetch type EAGER, cascade type DETACH,REMOVE,MERGE,PERSIST
  @ManyToMany(mappedBy = "courses", fetch = FetchType.EAGER,cascade = {CascadeType.DETACH, CascadeType.REMOVE, CascadeType.MERGE,CascadeType.MERGE, CascadeType.PERSIST})

  List<Course> getStudentCourses;


//  @Override
//    public List <Student> getAllStudents{
//      return List.of();
//    }
//    @Override
//    public void createStudent (Student student){
//
//    }
//@Override
//    public Student getStudentByEmail(String email){
//      return null;
}



