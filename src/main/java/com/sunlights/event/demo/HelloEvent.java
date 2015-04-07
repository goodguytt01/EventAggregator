package com.sunlights.event.demo;

import java.util.ArrayList;

import com.sunlights.event.Event;
import com.sunlights.event.core.EventExcuteError;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.sunlights.event.core.impl.LogErrorHandler.doError;

public class HelloEvent implements Event {


    private final static Logger logger = LoggerFactory.getLogger(HelloEvent.class);

    public Object excute(Object o, int step) throws EventExcuteError {
        if (step != 1) {
            doError("the wrong step of the HelloEvent,pls try to put the HelloEvent in the first place of the EventPublisher's addEvent function");
        }
        StringBuilder tmp = new StringBuilder();
        if (o instanceof ArrayList) {
            ArrayList<String> tmpWords = (ArrayList) o;
            for (String s : tmpWords) {
                tmp.append(s);
            }
        } else {
            doError("wrong type of Parameter");
        }
        return tmp.toString();
    }

}
