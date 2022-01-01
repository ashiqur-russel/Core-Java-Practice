package com.example.firstproject.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){

        return args -> {
            Student Mariam = new Student(
                    "mariam",
                    "mariam.jamal@gmail.com",
                    LocalDate.of(2000, JANUARY,12)
            );

            Student Jamal = new Student(

                    "Jamal",
                    "jamal@gmail.com",
                    LocalDate.of(1990, APRIL,12)
            );

            repository.saveAll(
                    List.of(Mariam,Jamal)
            );
        };
    }
}
