package sba.sms.services;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.hibernate.Session;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.*;
import sba.sms.models.Course;
import sba.sms.models.Student;
import sba.sms.utils.CommandLine;
import sba.sms.utils.HibernateUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.assertTrue;


class StudentServiceTest {
    private static Session session;
//    @BeforeAll
//    static void initialization (){
//         session = HibernateUtil.getSessionFactory().openSession();
//    }

    @Test
    public void createStudent(){


        Student student = new Student( "Elizabeth", "Marketing", "password");;
       assertTrue("Create a student test case", student.getName().equals("Elizabeth"));
        }

//    @Test
//    public void getStudentCourse(){
//
//    }
//    @Test
//     public void registerStudentToCourse(){
//
//    }
//    @Test
//    public void getStudentByEmail(){
//
//    }




}





