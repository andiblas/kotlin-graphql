package com.apujadas.api.graphql.models

import com.expediagroup.graphql.annotations.GraphQLDescription

@GraphQLDescription("Entity to define a person.")
data class Person(
    val name: String,
    val age: Int,
    val posts: MutableList<Post>
)
