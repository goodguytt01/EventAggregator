package com.sunlights.event.demo;

import com.sunlights.event.Event;
import com.sunlights.event.core.EventExcuteError;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.sunlights.event.core.impl.LogErrorHandler.doError;

public class PrintEvent implements Event {

    private final static Logger logger = LoggerFactory.getLogger(PrintEvent.class);

    public Object excute(Object o, int step) throws EventExcuteError {
        if (step != 2) {
            doError("the wrong step of the PrintEvent,pls try to put the PrintEvent in the second place of the EventPublisher's addEvent function");
        }
        if (o instanceof String) {
            logger.info(o.toString());
        } else {
            doError("wrong type of parameter");
        }
        return o;
    }
}
