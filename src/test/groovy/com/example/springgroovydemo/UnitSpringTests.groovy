package com.example.springgroovydemo

import com.example.springgroovydemo.repositories.PersonRepository
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest

import static org.junit.jupiter.api.Assertions.assertEquals

@DataJpaTest
class UnitSpringTests {

    @Autowired
    private PersonRepository repository


    @Test
    void repositoryTest(){
        def person = new Person()
        
        repository.save(person)
        repository.delete(person)
        assertEquals(person, repository.findById(1L).get())
    }
}
