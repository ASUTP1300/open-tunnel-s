package home.start.opentunnel.controller

import com.fasterxml.jackson.databind.ObjectMapper
import home.start.opentunnel.data.MessageDto
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController("/v0")
class OpenTunnelController(
    private val mapper: ObjectMapper
) {

    @PostMapping("/messages")
    fun publish(@RequestBody requestBody: String): ResponseEntity<Any> {
        val message = mapper.readValue(requestBody, MessageDto::class.java)

        return ResponseEntity.ok("Сообщение $message опубликовано")
    }

}