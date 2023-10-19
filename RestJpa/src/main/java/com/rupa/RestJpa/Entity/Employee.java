package com.rupa.RestJpa.Entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Entity
@Setter
@ToString
@NoArgsConstructor
@Table(name="EMPLOYEE")
public class Employee {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name="ID")
    private Long id;

    public Employee(String firstName, String lastName, String eMail) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.eMail = eMail;
    }

    @Column(name="FIRST_NAME")
    private String firstName;
    @Column(name="LAST_NAME")
    private String lastName;
    @Column(name="E-MAIL")
    private String eMail;


}
