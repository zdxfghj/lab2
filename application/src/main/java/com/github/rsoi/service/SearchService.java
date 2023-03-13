package com.github.rsoi.service;

import com.github.rsoi.components.Person;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

@Component
public class SearchService {
    public void getPersonTravelCount(ArrayList<Person> personList, int experienceTimes, int monthOfExperiences) {

        for (var person: personList) {
            for (var  travel: person.getTravels()) {
                Calendar cal = Calendar.getInstance();
                cal.setTime(travel.getTravel_date());
                if ((cal.get(Calendar.MONTH) == monthOfExperiences) && (experienceTimes == person.getTravels().size())){
                    System.out.println(person.getName());
                    break;
                }

            }

        }
    }

    public void getPersonViolations(ArrayList<Person> personList, int violationTimes, String dateInString) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date date = formatter.parse(dateInString);
            for (var person : personList) {
                for (var violation : person.getViolations()) {
                    if ((violation.getViolation_date().compareTo(date)) > 0 && (violationTimes == person.getViolations().size())) {
                        System.out.println(person.getName());
                        break;
                    }
                }
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void getPersonSpeandMoney(ArrayList<Person> personList,int general_costs) {
        int sum = 0;
        for (var person : personList) {
            for (var travel : person.getTravels()) {
                sum += travel.getTravel_cost();
            }
            if(general_costs == sum){
                System.out.println("имя человека: " + person.getName());
            }
        }
    }

    public void getPersonExpenses(ArrayList<Person> personList,int experiences) {
        for (var person : personList) {
            if(person.getExperience() == experiences){
                System.out.println("имя человека с введенным стажем: " +person.getName());
            }
        }
    }

}
