package sba.sms.models;

import jakarta.persistence.*;
import lombok.*;

import lombok.experimental.FieldDefaults;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Course is a POJO, configured as a persistent class that represents (or maps to) a table
 * name 'course' in the database. A Course object contains fields that represent course
 * information and a mapping of 'courses' that indicate an inverse or referencing side
 * of the relationship. Implement Lombok annotations to eliminate boilerplate code.
 */

@AllArgsConstructor
@RequiredArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@Entity
@Table (name = "course")
public class Course {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column (name = "id", unique = true)
   private int id;

    @Column(name = "name",length = 50, nullable = false)
    private String name;

    @Column(name = "instructor", length = 50, nullable = false )
    private String instructor;


//    private Set<Student> students;

//    public Course (){
//
//    }
//
//    public Course(String name, String instructor, Set<Student> students) {
//        this.name = name;
//        this.instructor = instructor;
//        this.students = students;
//
//    }
//
//    public Course(String name, String instructor) {
//        this.instructor = instructor;
//        this.name = name;
//    }

    @ManyToMany(fetch = FetchType.EAGER,cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.REMOVE, CascadeType.PERSIST})
    private Set<Student> students = new LinkedHashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return id == course.id && name.equals(course.name) && instructor.equals(course.instructor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, instructor);
    }
}







