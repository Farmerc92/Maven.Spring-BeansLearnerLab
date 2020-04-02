package com.zipcodewilmington.BeansLearnerLab.education;

import java.util.ArrayList;
import java.util.Iterator;

public class Students extends People<Student> {

    public Students(ArrayList<Student> personList){
        super(personList);
    }

    @Override
    public Iterator<Student> iterator(){
        return personList.iterator();
    }
}
