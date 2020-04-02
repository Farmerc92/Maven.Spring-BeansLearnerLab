package com.zipcodewilmington.BeansLearnerLab.config;

import com.zipcodewilmington.BeansLearnerLab.education.Instructor;
import com.zipcodewilmington.BeansLearnerLab.education.Instructors;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;

@Configuration
public class InstructorsConfig {

    @Bean(name = "tcUsaInstructors")
    public Instructors tcUsaInstructors(){
        ArrayList<Instructor> usaInstructors = new ArrayList<>();
        for (long i = 1; i < 6; i++) {
            usaInstructors.add(new Instructor(i, "USA Instructor " + i));
        }
        return new Instructors(usaInstructors);
    }
    @Qualifier
    @Bean(name = "tcUkInstructors")
    public Instructors tcUkInstructors(){
        ArrayList<Instructor> ukInstructors = new ArrayList<>();
        for(long i = 1; i < 6; i++){
            ukInstructors.add(new Instructor(i, "UK Instructor " + i));
        }
        return new Instructors(ukInstructors);
    }

    @Bean(name = "instructors")
    @Primary
    public Instructors zipCodeInstructors(){
        ArrayList<Instructor> instructors = new ArrayList<>();
        for (long i = 1; i < 5; i++) {
            instructors.add(new Instructor(i, "Zip Code Instructor " + i));
        }
        return new Instructors(instructors);
    }
}
