package com.yourname.Service;

import com.yourname.Dao.StudentDao1;
import com.yourname.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by jomama on 1/4/2017.
 */


@Service
public class StudentService {

    @Autowired
    private StudentDao1 studentDao1;
    public Collection<Student> getAllStudents(){

        return this.studentDao1.getAllStudents();
    }

}
