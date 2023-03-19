package com.artemrogov.microservice01.event.stream.producer;


import com.artemrogov.microservice01.web.request.MessageRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class MessageProducer {
    private final StreamBridge streamBridge;

    public void sendMessage(MessageRequest messageRequest){
        Message<MessageRequest> message = MessageBuilder.withPayload(messageRequest)
                .setHeader("operation", "send-msg")
                .build();
        streamBridge.send("messagesSenderChannel",message);
    }
}
