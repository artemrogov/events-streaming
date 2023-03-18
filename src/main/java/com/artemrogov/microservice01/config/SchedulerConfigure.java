package com.artemrogov.microservice01.config;


import com.artemrogov.microservice01.event.message.EventMessagePublisher;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
@RequiredArgsConstructor
public class SchedulerConfigure {

    private final EventMessagePublisher ePublishMsg;

    /**
     * В этом случае продолжительность между окончанием последнего выполнения и началом следующего выполнения является фиксированной.
     * Задача всегда ожидает завершения предыдущей.
     * Этот параметр следует использовать, когда необходимо, чтобы предыдущее выполнение было завершено перед повторным запуском.
     */
    @Scheduled(fixedDelay = 1000L)
    public void createSimpleMessageFixDelay(){
        String simpleText = "Test message fix delay 1000L";
        ePublishMsg.publishMessage(simpleText);
    }


    @Scheduled(fixedDelay = 1000L)
    public void createSimpleMsgFixDelayTwoSteps(){
        String simpleText = "Test 2 message";
        ePublishMsg.publishMessage(simpleText);
    }
}
