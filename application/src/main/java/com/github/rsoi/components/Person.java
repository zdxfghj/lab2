package com.github.rsoi.components;

import java.util.ArrayList;


public class Person {
    private String name;
    private int age;
    private int experience;
    private ArrayList<Violation> violations;
    private ArrayList<Travel> travels;


    public Person(String name, int age, int experience) {
        this.name = name;
        this.age = age;
        this.experience = experience;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getExperience() {
        return experience;
    }

    public ArrayList<Travel> getTravels() {
        return travels;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setTravels(ArrayList<Travel> travels) {
        this.travels = travels;
    }

    public void setViolations(ArrayList<Violation> violations) {
        this.violations = violations;
    }

    public ArrayList<Violation> getViolations() {
        return violations;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", experience=" + experience +
                ", violations=" + violations +
                ", travels=" + travels +
                '}';
    }
}
