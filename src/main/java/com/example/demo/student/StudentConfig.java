package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student Tithurshan = new Student(
                    "Tithurshan",
                    "e21413@eng.pdn.ac.lk",
                    LocalDate.of(2002, Month.DECEMBER, 28),
                    22
            );

            Student Varshan = new Student(
                    "Varshan",
                    "Varshan@gmail.com",
                    LocalDate.of(2001, Month.FEBRUARY, 20),
                    23
            );

            repository.saveAll(
                    List.of(Tithurshan,Varshan)
            );
        };
    }
}
