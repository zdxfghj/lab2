package com.github.rsoi.service;

import com.github.rsoi.components.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component
public class PeronService {
    private ArrayList<Person> listOfPersons;
    public PeronService() {
        System.out.println("Person constructor");
        this.listOfPersons = new ArrayList<Person>();

    }

    public ArrayList<Person> getListOfPersons() {
        return listOfPersons;
    }

    public void setListOfPersons(ArrayList<Person> listOfPersons) {
        this.listOfPersons = listOfPersons;
    }

    public void generatePersonsList(){
        this.listOfPersons.add(new Person("Stefania", 20, 2));
        this.listOfPersons.add(new Person("Vladislau", 22, 3));
    }
}
