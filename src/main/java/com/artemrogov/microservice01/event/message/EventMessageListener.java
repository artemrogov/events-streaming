package com.artemrogov.microservice01.event.message;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class EventMessageListener implements ApplicationListener<EventMessage> {
    @Override
    public void onApplicationEvent(EventMessage event) {
        System.out.println("event message: " + event.getMessage());
    }
}
