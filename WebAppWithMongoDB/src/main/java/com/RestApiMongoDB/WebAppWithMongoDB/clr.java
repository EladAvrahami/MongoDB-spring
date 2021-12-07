package com.RestApiMongoDB.WebAppWithMongoDB;

import org.springframework.boot.CommandLineRunner;

import java.math.BigDecimal;
import java.sql.Array;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class clr implements CommandLineRunner {
    private StudentsRepo studentsRepo;

    public clr(StudentsRepo studentsRepo) {
        this.studentsRepo = studentsRepo;
    }

    @Override
    public void run(String... args) throws Exception {
        Address address =new Address("Israel","tel aviv","1112223");
        Students s1= new Students("Elad","Avrahami","elad@gmail.com",Gender.MALE,
               address, List.of("Computer for beginners","Math"), BigDecimal.TEN, LocalDateTime.now());

        this.studentsRepo.save(s1);
        this.studentsRepo.insert(s1);
    }

}
