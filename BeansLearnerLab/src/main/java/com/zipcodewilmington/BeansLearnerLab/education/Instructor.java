package com.zipcodewilmington.BeansLearnerLab.education;

import java.util.ArrayList;
import java.util.List;

public class Instructor extends Person implements Teacher {

    private Double numberOfHoursTaught;

    public Instructor(Long id, String name){
        super(id, name);
        numberOfHoursTaught = 0.0;
    }

    public Double getNumberOfHoursTaught(){
        return numberOfHoursTaught;
    }


    @Override
    public void teach(Learner learner, Double numberOfHours) {
        learner.learn(numberOfHours);
        numberOfHoursTaught += numberOfHours;
    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, Double numberOfHours) {
        List<Learner> learnersList = new ArrayList<>();
        learners.forEach(learnersList::add);
        Double numberOfHoursPerLearner = numberOfHours / learnersList.size();
        learnersList.forEach(learner -> learner.learn(numberOfHoursPerLearner));
        numberOfHoursTaught += numberOfHours;
    }
}
