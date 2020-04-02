package com.zipcodewilmington.BeansLearnerLab.config;

import com.zipcodewilmington.BeansLearnerLab.education.Student;
import com.zipcodewilmington.BeansLearnerLab.education.Students;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class StudentsConfig {

    @Bean(name = "currentStudents")
    public Students currentStudents(){
        ArrayList<Student> currentStudents = new ArrayList<>();
        for (long i = 1; i < 31; i++) {
            currentStudents.add(new Student(i, "Current Student " + i));
        }
        return new Students(currentStudents);
    }

    @Bean(name = "previousStudents")
    public Students previousStudents(){
        ArrayList<Student> previousStudents = new ArrayList<>();
        for(long i = 1; i < 31; i++){
            previousStudents.add(new Student(i, "Previous Student " + i));
        }
        return new Students(previousStudents);
    }
}
