package com.example.springgroovydemo.controllers

import com.example.springgroovydemo.Person
import com.example.springgroovydemo.services.PersonService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
class PersonController {

    // inject dependency through constructor
    private final PersonService service

    PersonController(PersonService service){
        this.service = service
    }

    // Get Person by id
    @GetMapping("/person/{id}")
    def getPersonById(@PathVariable("id") long id){
        new ResponseEntity<String>(
                service.getPersonById(id).toString(), HttpStatus.OK
        )
    }

    // Create a person
    @PostMapping("/create")
     def createPerson(@RequestBody Person person){
        service.savePerson(person)
        new ResponseEntity<String>(person.toString(), HttpStatus.OK)
    }

    // Edit existing person
    @PutMapping("/update/{id}")
    def updatePerson(@RequestBody Person person, @PathVariable("id") long id){
        service.updatePerson(person)
        new ResponseEntity<String>("Person updated", HttpStatus.OK)

    }


    @DeleteMapping("/delete/{id}")
    def deletePersonById(@PathVariable("id") long id){
        service.deletePersonById(id)
        new ResponseEntity<String>("Deleted", HttpStatus.OK)
    }
}
