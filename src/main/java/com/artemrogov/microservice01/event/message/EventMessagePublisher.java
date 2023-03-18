package com.artemrogov.microservice01.event.message;


import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EventMessagePublisher {
    private final ApplicationEventPublisher appEventPublisher;

    public void publishMessage(final String message){
        EventMessage eventMessage = new EventMessage(this,message);
        appEventPublisher.publishEvent(eventMessage);
    }
}
