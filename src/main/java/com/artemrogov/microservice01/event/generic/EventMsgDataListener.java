package com.artemrogov.microservice01.event.generic;


import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EventMsgDataListener {

    @EventListener(condition = "#eventMsgData.send")
    public void handleMessage(EventMsgData eventMsgData){
        System.out.println("publish event generics:");
        System.out.println("message text see" + eventMsgData.getMessage());
    }
}
