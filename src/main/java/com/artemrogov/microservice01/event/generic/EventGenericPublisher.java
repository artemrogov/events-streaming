package com.artemrogov.microservice01.event.generic;


import com.artemrogov.microservice01.web.request.MessageRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EventGenericPublisher {
    private final ApplicationEventPublisher ePublisher;

    public void publish(MessageRequest messageRequest, boolean send){
        EventMsgData eventMsgData = new EventMsgData<MessageRequest>(this,messageRequest,send);
        ePublisher.publishEvent(eventMsgData);
    }
}
