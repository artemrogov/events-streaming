package com.artemrogov.microservice01.event.asyc;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@Configuration
public class EventAsyncMessageListener {

    @Async
    @EventListener
    public void handlerAsyncMessage01(EventAsyncMessage messageEvent){
       System.out.println("message 01: " + messageEvent.getMessage());
       System.out.println("event completed");
    }

    @Async
    @EventListener
    public void handlerAsyncMessage02(EventAsyncMessage messageEvent){
        System.out.println("message 02: " + messageEvent.getMessage());
        System.out.println("event completed");
    }

    @Async
    @EventListener
    public void handlerAsyncMessage03(EventAsyncMessage messageEvent){
        System.out.println("message 03: " + messageEvent.getMessage());
        System.out.println("event completed");
    }
}
