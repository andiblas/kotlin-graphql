package com.apujadas.api.graphql.mutations

import com.expediagroup.graphql.annotations.GraphQLDescription
import com.expediagroup.graphql.spring.operations.Mutation
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.time.delay
import org.springframework.stereotype.Component
import java.time.Duration

@Component
class SimpleMutation : Mutation {

    private val data: MutableList<String> = mutableListOf()

    @GraphQLDescription("add value to a list and return resulting list")
    suspend fun addToList(entry: String) = coroutineScope {
        delay(Duration.ofMillis(200))    // simulate hard work
        data.add(entry)
        data
    }
}
