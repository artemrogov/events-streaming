package com.artemrogov.microservice01.event.stream.consumer;

import com.artemrogov.microservice01.web.response.MessageResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.function.Consumer;
import org.springframework.messaging.Message;

@Configuration
@Slf4j
public class MessageProcessorData {

    @Bean
    public Consumer<Message<MessageResponse>> messageProcessorChannel(){
         return msg-> System.out.println("test output message: " + msg.getPayload().getMessage());
    }
}
