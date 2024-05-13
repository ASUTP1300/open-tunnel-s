package home.start.opentunnel.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController("/v0")
class OpenTunnelController {

    @PostMapping("/messages")
    fun publish(): ResponseEntity<Any> =
        ResponseEntity.ok("Сообщение опубликовано")
}