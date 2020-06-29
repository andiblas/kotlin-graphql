package com.apujadas.api.graphql

import com.apujadas.api.graphql.models.Person
import org.springframework.stereotype.Repository

@Repository
class PersonRepository {

    companion object {
        private val persons = mutableListOf<Person>()
    }

    init {
        persons.add(Person("Backender 1", 30, mutableListOf()))
        persons.add(Person("Backender 2", 30, mutableListOf()))
        persons.add(Person("Backender 3", 30, mutableListOf()))
    }

    fun getAll() = persons

    fun takeLast(last: Int) = persons.takeLast(last)

    fun save(newPerson: Person) : Person {
        persons.add(newPerson)
        return newPerson
    }
}
