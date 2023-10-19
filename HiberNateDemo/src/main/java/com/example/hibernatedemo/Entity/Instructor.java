package com.example.hibernatedemo.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter@Setter@NoArgsConstructor
@Table(name="INSTRUCTOR")
public class Instructor {
    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY
    )
    private int id;
    @Column(name="FIRST_NAME") private String firstName;
    @Column(name="LAST_NAME")  private String lastName;
    @Column(name="EMAIL")  private  String email;

    public Instructor(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    @OneToOne(cascade=CascadeType.ALL)
   @JoinColumn(name="INSTRUCTOR_DETAIL_ID")
   private InstructorDetails instructorDetails;

    @Override
    public String  toString() {
        return "Instructor{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", instructorDetails=" + instructorDetails +
                '}';
    }
}
