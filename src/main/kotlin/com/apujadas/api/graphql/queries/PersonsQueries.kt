package com.apujadas.api.graphql.queries

import com.apujadas.api.graphql.PersonRepository
import com.expediagroup.graphql.spring.operations.Query
import kotlinx.coroutines.coroutineScope
import org.springframework.stereotype.Component

@Component
class PersonsQueries(
    val personRepository: PersonRepository
) : Query {

    suspend fun allPersons(last: Int?) = coroutineScope {
        if (last != null)
            personRepository.takeLast(last)
        else
            personRepository.getAll()
    }
}
