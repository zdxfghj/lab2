package com.github.rsoi.service;


import com.github.rsoi.components.Person;
import com.github.rsoi.components.Violation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;

@Component
public class ViolationSevice {
    private PeronService personService;
    @Autowired
    public ViolationSevice(PeronService personService) {
        this.personService = personService;
    }

    public void generateViolations() {
        personService.generatePersonsList();
        for (var person : personService.getListOfPersons()) {
            ArrayList<Violation> listOfViolation = new ArrayList<>();
            listOfViolation.add(new Violation("violation1", new Date()));
            listOfViolation.add(new Violation("violation2", new Date()));
            listOfViolation.add(new Violation("violation3", new Date()));
            listOfViolation.add(new Violation("violation4", new Date()));
            listOfViolation.add(new Violation("violation5", new Date()));
            listOfViolation.add(new Violation("violation6", new Date()));
            listOfViolation.add(new Violation("violation7", new Date()));
            person.setViolations(listOfViolation);
        }
    }

}
