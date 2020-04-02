package com.zipcodewilmington.BeansLearnerLab.config;

import com.zipcodewilmington.BeansLearnerLab.education.Classroom;
import com.zipcodewilmington.BeansLearnerLab.education.Instructors;
import com.zipcodewilmington.BeansLearnerLab.education.Students;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClassroomConfigTest {

    @Autowired
    @Qualifier("currentCohort")
    private Classroom currentCohort;

    @Autowired
    @Qualifier("previousCohort")
    private Classroom previousCohort;

    @Autowired
    ClassroomConfig classroomConfig;

    @Test
    public void currentCohortTest(){
        for (long i = 1; i < 5; i++) {
            Assert.assertEquals(currentCohort.getInstructors().findById(i).getName(), "Zip Code Instructor " + i);
            Assert.assertEquals(currentCohort.getStudents().findById(i).getName(), "Student " + i);
        }
    }

    @Test
    public void previousCohortTest(){
        for(long i = 1; i < 6; i++){
            Assert.assertEquals(previousCohort.getInstructors().findById(i).getName(), "UK Instructor " + i);
            Assert.assertEquals(previousCohort.getStudents().findById(i).getName(), "Previous Student " + i);
        }
    }

}
