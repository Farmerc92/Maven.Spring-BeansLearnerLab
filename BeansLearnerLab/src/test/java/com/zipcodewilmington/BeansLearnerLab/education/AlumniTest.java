package com.zipcodewilmington.BeansLearnerLab.education;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AlumniTest {

    @Autowired
    private Alumni alumni;

    @Test
    public void executeBootcampTest(){
        for(long i = 1; i < 31; i++){
            Assert.assertEquals(alumni.getStudents().findById(i).getTotalStudyTime(), 1200.0, 0.01);
        }
    }
}
