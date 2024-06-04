package example.r2dbctest.domain

import org.springframework.data.annotation.Id

data class Person(
    @Id val id: Long?,
    val name: String,
    val age: Int
)
