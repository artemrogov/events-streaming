package com.artemrogov.microservice01.web;


import com.artemrogov.microservice01.event.asyc.EventAsyncPublisher;
import com.artemrogov.microservice01.event.message.EventMessagePublisher;
import com.artemrogov.microservice01.web.request.MessageRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class EventRestController {
    private final EventMessagePublisher ePublisherMessage;
    private final EventAsyncPublisher eEventAsyncMsgPublisher;

    @PostMapping(value = "/send-sync")
    public ResponseEntity<String>publishMessageSync(@RequestBody MessageRequest messageRequest){
        ePublisherMessage.publishMessage(messageRequest.getMessage());
        return ResponseEntity.ok("publish sync message");
    }

    @PostMapping(value = "/send-async")
    public ResponseEntity<String>publishMessageAsync(@RequestBody MessageRequest messageRequest){
        eEventAsyncMsgPublisher.publish(messageRequest.getMessage());
        return ResponseEntity.ok("publish async message");
    }
}
