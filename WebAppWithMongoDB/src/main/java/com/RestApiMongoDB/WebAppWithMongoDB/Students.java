package com.RestApiMongoDB.WebAppWithMongoDB;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.List;

@Data/*give : getters setters const equals hashcoed toSring ...*/
@Document   /*tell class it going to be collection*/
public class Students {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    @Indexed(unique = true)/*specialize the email*/
    private String email;
    private Gender gender;
    private Address address;
    private List<String> favouriteSub;
    private BigDecimal totalSpentInBooks;
    private LocalDateTime created;//זמן יצירת תלמיד חדש


    public Students(String firstName, String lastName, String email, Gender gender, Address address, List<String> favouriteSub, BigDecimal totalSpentInBooks, LocalDateTime created) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.address = address;
        this.favouriteSub = favouriteSub;
        this.totalSpentInBooks = totalSpentInBooks;
        this.created = created;
    }
}
