package com.zipcodewilmington.BeansLearnerLab.config;

import com.zipcodewilmington.BeansLearnerLab.education.Instructors;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InstructorsConfigTest {

    @Autowired
    @Qualifier("tcUsaInstructors")
    private Instructors tcUsaInstructors;

    @Autowired
    @Qualifier("tcUkInstructors")
    private Instructors tcUkInstructors;

    @Autowired
    @Qualifier("instructors")
    private Instructors instructors;

    @Autowired
    private InstructorsConfig instructorsConfig;

    @Test
    public void tcUsaInstructorsTest(){
        for(long i = 1; i < 6; i++){
            Assert.assertEquals(tcUsaInstructors.findById(i).getName(), "USA Instructor "+ i);
        }
    }

    @Test
    public void tcUkInstructorsTest(){
        for(long i = 1; i < 6; i++){
            Assert.assertEquals(tcUkInstructors.findById(i).getName(), "UK Instructor " + i);
        }
    }

    @Test
    public void zipCodeInstructorsTest(){
        for(long i = 1; i < 5; i++){
            Assert.assertEquals(instructors.findById(i).getName(), "Zip Code Instructor " + i);
        }
    }
}
