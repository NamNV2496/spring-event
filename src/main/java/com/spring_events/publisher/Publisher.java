package com.spring_events.publisher;

import com.spring_events.event.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class Publisher {
    @Autowired
    ApplicationEventPublisher applicationEventPublisher;

    public void publishEvent(String guestName) {
        applicationEventPublisher.publishEvent(new Event(this, guestName));
    }
}

