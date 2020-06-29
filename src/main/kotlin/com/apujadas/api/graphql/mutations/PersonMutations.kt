package com.apujadas.api.graphql.mutations

import com.apujadas.api.graphql.PersonRepository
import com.apujadas.api.graphql.models.Person
import com.expediagroup.graphql.spring.operations.Mutation
import kotlinx.coroutines.coroutineScope
import org.springframework.stereotype.Component

@Component
class PersonMutations(
    val personRepository: PersonRepository
) : Mutation {
    suspend fun createPerson(newPerson: Person) = coroutineScope {
        personRepository.save(newPerson)
        newPerson
    }
}
