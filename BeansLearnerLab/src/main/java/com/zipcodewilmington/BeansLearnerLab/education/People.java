package com.zipcodewilmington.BeansLearnerLab.education;

import java.util.List;

public abstract class People<PersonType extends Person> implements Iterable<PersonType> {

    List<PersonType> personList;

    public People(List<PersonType> personList){
        this.personList = personList;
    }

    public void add(PersonType person){
        personList.add(person);
    }

    public void remove(PersonType person){
        personList.remove(person);
    }

    public int size(){
        return personList.size();
    }

    public void clear(){
        personList.clear();
    }

    public void addAll(Iterable<PersonType> people){
        people.forEach(personList::add);
    }

    public PersonType findById(Long id){
        for(PersonType p : personList){
            if (p.getId().equals(id))
                return p;
        }
        return null;
    }

    public List<PersonType> findAll(){
        return personList;
    }
}
