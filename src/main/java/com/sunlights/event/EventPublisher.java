package com.sunlights.event;

import java.util.LinkedList;

import com.sunlights.event.core.EventExcuteError;

/**
 * Created by Edward on 2015/4/2.
 */
public class EventPublisher<E extends Event> {

    private LinkedList<E> eventContainer = new LinkedList<E>();

    Object currentPara;

    int currentStep = 1;

    public EventPublisher<E> addEvent(E e) {
        eventContainer.add(e);
        return this;
    }

    public EventPublisher<E> removeEvent(E e) {
        eventContainer.remove(e);
        return this;
    }

    public void publish(Object params) throws EventExcuteError {
        for (E e : eventContainer) {
            if (currentPara == null) {
                currentPara = e.excute(params, currentStep++);
            } else {
                e.excute(currentPara, currentStep++);
            }
        }
    }
}
