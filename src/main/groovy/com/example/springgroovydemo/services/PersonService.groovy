package com.example.springgroovydemo.services

import com.example.springgroovydemo.Person

// this service manipulates person data
interface PersonService {

    List<Person> getAllPerson()
    Person savePerson(Person person)
    Person getPersonById(long id)
    Person updatePerson(Person person)
    void deletePersonById(long id)
}