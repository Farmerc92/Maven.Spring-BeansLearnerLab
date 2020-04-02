package com.zipcodewilmington.BeansLearnerLab.config;

import com.zipcodewilmington.BeansLearnerLab.education.Student;
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
public class StudentsConfigTest {
    @Autowired
    @Qualifier("students")
    private Students currentStudents;

    @Autowired
    @Qualifier("previousStudents")
    private Students previousStudents;

    @Autowired
    private StudentsConfig studentsConfig;

    @Test
    public void testCurrentStudents(){
        for (long i = 1; i < 31; i++){
            Assert.assertEquals(currentStudents.findById(i).getName(), "Student " + i);
        }
    }

    @Test
    public void testPreviousStudents(){
        for (long i = 1; i < 31; i++) {
            Assert.assertEquals(previousStudents.findById(i).getName(), "Previous Student " + i);
        }
    }

}
