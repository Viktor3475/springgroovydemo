package com.example.springgroovydemo

import jakarta.persistence.*

@Entity
@Table(name = "PERSON")

class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     long id

    @Column(name = "FNAME")
    String fName

    @Column(name = "LNAME")
    String lName

    @Column(name = "AGE")
    int age

    Person(){}

    @Override
    String toString() {
        "Person{" +
                "id=" + id +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", age=" + age +
                '}'
    }
}
