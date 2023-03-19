package com.artemrogov.microservice01.event.generic;

import org.springframework.core.ResolvableType;
import org.springframework.core.ResolvableTypeProvider;

public class EventMsgData <T> implements ResolvableTypeProvider {

    private Object source;
    private T message;

    protected boolean send;

    public EventMsgData(Object source, T message, boolean send) {
        this.source = source;
        this.message = message;
        this.send = send;
    }

    public T getMessage() {
        return message;
    }

    public void setMessage(T message) {
        this.message = message;
    }

    public boolean isSend() {
        return send;
    }

    public void setSend(boolean send) {
        this.send = send;
    }

    public Object getSource() {
        return source;
    }

    public void setSource(Object source) {
        this.source = source;
    }

    @Override
    public ResolvableType getResolvableType() {
        return ResolvableType.forClassWithGenerics(
                getClass(), ResolvableType.forInstance(getSource())
        );
    }
}
