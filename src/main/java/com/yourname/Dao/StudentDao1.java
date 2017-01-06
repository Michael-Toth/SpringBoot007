package com.yourname.Dao;

import com.yourname.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.lang.annotation.Retention;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jomama on 1/4/2017.
 */
@Repository
public class StudentDao1 {

private static Map<Integer,Student> students;
static {
    students = new HashMap <Integer, Student>() {
        {
            put(1, new Student(1, "a", "amath"));
            put(2, new Student(2, "b", "bmath"));
            put(3, new Student(3, "c", "cmath"));
        }

    };
}


public Collection<Student> getAllStudents(){

   return this.students.values();
}

}//class
