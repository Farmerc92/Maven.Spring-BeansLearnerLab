package com.zipcodewilmington.BeansLearnerLab.config;

import com.zipcodewilmington.BeansLearnerLab.education.Classroom;
import com.zipcodewilmington.BeansLearnerLab.education.Instructors;
import com.zipcodewilmington.BeansLearnerLab.education.Students;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class ClassroomConfig {

    @Bean(name = "currentCohort")
    @DependsOn({"instructors", "students"})
    public Classroom currentCohort(@Qualifier("students") Students students, @Qualifier("instructors") Instructors instructors){
        return new Classroom(students, instructors);
    }

    @Bean(name = "previousCohort")
    @DependsOn({"tcUsaInstructors", "previousStudents"})
    public Classroom previousCohort(@Qualifier("previousStudents") Students students, @Qualifier("tcUkInstructors") Instructors instructors){
        return new Classroom(students, instructors);
    }
}
