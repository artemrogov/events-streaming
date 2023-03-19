package com.artemrogov.microservice01.web;

import com.artemrogov.microservice01.event.stream.producer.MessageProducer;
import com.artemrogov.microservice01.web.request.MessageRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api-stream")
@RequiredArgsConstructor
public class StreamingRestController {

    private final MessageProducer messageProducer;

    @PostMapping(value = "/send-simple")
    public ResponseEntity<String> sendDataChannel(@RequestBody MessageRequest messageRequest){
         messageProducer.sendMessage(messageRequest);
         return ResponseEntity.ok("send channel message");
    }
}
