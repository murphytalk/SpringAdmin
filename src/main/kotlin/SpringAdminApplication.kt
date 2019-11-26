package murphytalk.springadmin

import de.codecentric.boot.admin.server.config.EnableAdminServer
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@EnableAdminServer
@SpringBootApplication
class SpringAdminApplication

fun main(args: Array<String>) {
	runApplication<SpringAdminApplication>(*args)
}
