package com.spring_events.controller;

import com.spring_events.publisher.Publisher;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class EventController {

    private final Publisher publisher;

    @GetMapping("/event")
    public void event(@RequestParam String name) {
        publisher.publishEvent(name);
    }
}
