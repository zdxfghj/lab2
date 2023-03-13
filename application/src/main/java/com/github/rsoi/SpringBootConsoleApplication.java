package com.github.rsoi;

import com.github.rsoi.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootConsoleApplication implements CommandLineRunner {

    private final MainService mainService;

    @Autowired
    public SpringBootConsoleApplication( MainService mainService) {

        this.mainService = mainService;
    }

    public static void main(String[] args) {

        SpringApplication.run(SpringBootConsoleApplication.class, args);

	}

    @Override
    public void run(String... args) {

        mainService.runMainProgram();




    }
}
