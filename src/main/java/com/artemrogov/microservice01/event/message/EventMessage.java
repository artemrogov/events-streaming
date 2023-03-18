package com.artemrogov.microservice01.event.message;

import org.springframework.context.ApplicationEvent;

public class EventMessage extends ApplicationEvent {

    private final String message;

    public EventMessage(Object source, String msg) {
        super(source);
        this.message  = msg;
    }

    public String getMessage() {
        return message;
    }
}
