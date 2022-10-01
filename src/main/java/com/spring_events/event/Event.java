package com.spring_events.event;

import org.springframework.context.ApplicationEvent;

public class Event extends ApplicationEvent {
    public String guestName;

    public Event(Object source, String guestName) {
        super(source);
        this.guestName = guestName;
    }

    public String getGuestName() {
        return guestName;
    }
}