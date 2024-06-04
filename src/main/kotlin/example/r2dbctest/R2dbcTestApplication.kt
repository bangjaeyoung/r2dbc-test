package example.r2dbctest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class R2dbcTestApplication

fun main(args: Array<String>) {
	runApplication<R2dbcTestApplication>(*args)
}
