package com.example.springgroovydemo.repositories

import com.example.springgroovydemo.Person
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
//Repository which stores data for a person (many people)
@Repository
interface PersonRepository extends JpaRepository<Person, Long> {
// interact with DB with the help of JPA
}