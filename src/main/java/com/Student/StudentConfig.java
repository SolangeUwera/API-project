package com.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.util.Calendar.JANUARY;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student brilliance = new Student("brilliance", "brilliance@gmail.com",
                    LocalDate.of(2000,Month.JANUARY, 5));

            Student clever = new Student("clever", "clever@gmail.com",
                    LocalDate.of(2007,Month.JANUARY, 5));

            repository.saveAll(List.of(brilliance, clever));
        };
    }
}
