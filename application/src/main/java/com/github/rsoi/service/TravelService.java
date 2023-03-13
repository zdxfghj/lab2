package com.github.rsoi.service;

import com.github.rsoi.components.Travel;
import com.github.rsoi.components.Violation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;


import com.github.rsoi.components.Person;
import com.github.rsoi.components.Violation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;

    @Component
    public class TravelService {
        private PeronService personService;
        @Autowired
        public TravelService(PeronService personService) {
            this.personService = personService;
        }

        public void generateTravel() {
            personService.generatePersonsList();
            for (var person : personService.getListOfPersons()) {
                ArrayList<Travel> listOfTravels = new ArrayList<>();
                listOfTravels.add(new Travel(10.0, new Date()));
                listOfTravels.add(new Travel(11.0, new Date()));
                listOfTravels.add(new Travel(10.0, new Date()));
                person.setTravels(listOfTravels);
            }
        }

    }
