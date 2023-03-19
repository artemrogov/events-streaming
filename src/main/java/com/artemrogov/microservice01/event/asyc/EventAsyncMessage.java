package com.artemrogov.microservice01.event.asyc;

import org.springframework.context.ApplicationEvent;

public class EventAsyncMessage extends ApplicationEvent {

    private final String message;

    public EventAsyncMessage(Object source, String message) {
        super(source);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
