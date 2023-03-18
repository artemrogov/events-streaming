package com.artemrogov.microservice01.event.asyc;

import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EventAsyncPublisher {
    private final ApplicationEventPublisher appEventPublisher;

    public void publish(String message){
        EventAsyncMessage eventAsyncMessage = new EventAsyncMessage(this,message);
        appEventPublisher.publishEvent(eventAsyncMessage);
    }
}
