package dev.golony.admin.springbootadmin

import de.codecentric.boot.admin.server.config.EnableAdminServer
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableAdminServer
class SpringBootAdminApplication

fun main(args: Array<String>) {
	runApplication<SpringBootAdminApplication>(*args)
}
