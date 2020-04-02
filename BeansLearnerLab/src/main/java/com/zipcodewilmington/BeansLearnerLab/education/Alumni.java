package com.zipcodewilmington.BeansLearnerLab.education;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Alumni {

    @Autowired
    @Qualifier("instructors")
    private Instructors instructors;

    @Autowired
    @Qualifier("previousStudents")
    private Students students;

    @PostConstruct
    public void executeBootcamp(){
        Double numberOfHoursPer = (1200.0 * students.size()) / instructors.size();
        instructors.forEach(instructor -> instructor.lecture(students, numberOfHoursPer));
    }

    public Instructors getInstructors() {
        return instructors;
    }

    public void setInstructors(Instructors instructors) {
        this.instructors = instructors;
    }

    public Students getStudents() {
        return students;
    }

    public void setStudents(Students students) {
        this.students = students;
    }
}
