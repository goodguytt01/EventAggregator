package com.sunlights.event;

import java.util.HashMap;
import java.util.Map;

public class EventAggregator {

    private Map<String, Event> events = new HashMap<String, Event>();

    public void addEvent(String eventType, Event event) {
        events.put(eventType, event);
    }

    public Event getEvent(String eventType) {
        return events.get(eventType);
    }
}
