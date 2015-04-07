package com.sunlights.event.core;


public class EventExcuteError extends Exception {

    /**
     * Default serialVersionUID for serialization
     */
    private static final long serialVersionUID = 1L;

    public EventExcuteError(String errorMsg) {
        super(errorMsg);
    }

}
