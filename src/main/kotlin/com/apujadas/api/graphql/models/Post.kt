package com.apujadas.api.graphql.models

import com.expediagroup.graphql.annotations.GraphQLDescription

@GraphQLDescription("Entity to define a post with it's author.")
data class Post(
    val title: String,
    val author: Person
)
