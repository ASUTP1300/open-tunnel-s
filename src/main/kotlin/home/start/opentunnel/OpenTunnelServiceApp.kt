package home.start.opentunnel

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class OpenTunnelServiceApp

fun main(args: Array<String>) {
    runApplication<OpenTunnelServiceApp>(*args)
}