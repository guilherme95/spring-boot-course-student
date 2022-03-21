package br.com.guilherme.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Guilherme",
                        "guilhermemello62@gmail.com",
                        LocalDate.of(1995, Month.NOVEMBER, 25),
                        21
                )
        );
    }
}
