package com.example.springgroovydemo.services

import com.example.springgroovydemo.Person
import com.example.springgroovydemo.repositories.PersonRepository
import org.springframework.stereotype.Service

@Service
class PersonServiceImpl implements PersonService{
    private final PersonRepository repository

    PersonServiceImpl(PersonRepository repository) {
        this.repository = repository
    }

    // get all people from repo
    @Override
    List<Person> getAllPerson() {
        repository.findAll()
    }
    // save person into repo
    @Override
    Person savePerson(Person person) {
        repository.save(person)
    }

    // get person by id from repo
    @Override
    Person getPersonById(long id) {
        repository.findById(id)
                .orElseThrow(()-> new Exception("Id not found: $id"))
    }

    // update details for person and save it into repo
    @Override
    Person updatePerson(Person person) {
        repository.save(person)
    }

    // delete person by id from repo
    @Override
    void deletePersonById(long id) {
        repository.deleteById(id)
    }
}
