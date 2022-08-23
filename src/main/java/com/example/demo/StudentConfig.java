package com.example.demo;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.student.Student;
import com.example.demo.student.StudentRepository;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student red = new Student(
                    "Red",
                    "Red.jama@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5));

            Student mariam = new Student(
                    "Mariam",
                    "mariam.jama@gmail.com",
                    LocalDate.of(2004, Month.JANUARY, 13));

            repository.saveAll(
                    List.of(red, mariam));
        };
    }

}
