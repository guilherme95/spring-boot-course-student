package br.com.guilherme.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student guilherme = new Student(
                    "Guilherme",
                    "guilherme@email.com",
                    LocalDate.of(1995, Month.NOVEMBER, 25)
            );
            Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2005, Month.MARCH, 12)
            );
            studentRepository.saveAll(List.of(guilherme, alex));
        };
    }

}
