package com.spring_events.listenner;

import com.spring_events.event.Event;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class Listenner {

    @Async
    @EventListener
    public void doorBellEventListener(Event doorBellEvent) {
        System.out.println(Thread.currentThread().getName() + ": Catch a event : " + doorBellEvent.getGuestName());
    }
}
