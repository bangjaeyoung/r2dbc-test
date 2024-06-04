package example.r2dbctest.domain

import org.springframework.data.repository.reactive.ReactiveCrudRepository

interface PersonRepository : ReactiveCrudRepository<Person, Long> {
}
