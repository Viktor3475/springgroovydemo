package com.example.springgroovydemo


import com.example.springgroovydemo.services.PersonService
import com.example.springgroovydemo.services.PersonServiceImpl
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.junit.jupiter.MockitoExtension
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

import static org.junit.jupiter.api.Assertions.*

@SpringBootTest
class SpringgroovydemoApplicationTests {

	@Autowired
	private PersonService personService

	@Test
	void areTheIDsEqualOfThePersons(){

		def person = new Person()
		assertEquals(personService.savePerson(person).getId(),
				personService.getPersonById(1L).getId())

	}

}
