package com.sunlights.event;

import com.sunlights.event.core.EventExcuteError;
import com.sunlights.event.demo.HelloEvent;
import com.sunlights.event.demo.PrintEvent;
import org.junit.Test;

import java.util.ArrayList;

public class HelloWorldEventTest {

    @Test
    public void testHelloWorldEvent() throws EventExcuteError {
        EventPublisher publiser = new EventPublisher();
        ArrayList<String> params = new ArrayList<String>();
        params.add("Hello ");
        params.add("world");
        publiser.addEvent(new HelloEvent()).addEvent(new PrintEvent()).publish(params);
    }


    @Test
    public void testRemoveEvent() throws EventExcuteError {
        EventPublisher publiser = new EventPublisher();
        ArrayList<String> params = new ArrayList<String>();
        params.add("Hello ");
        params.add("world");
        PrintEvent printEvent = new PrintEvent();
        publiser.addEvent(new HelloEvent()).addEvent(printEvent).removeEvent(printEvent).publish(params);
    }

    @Test
    public void testRemoveEventWrongStep() {
        try {
            EventPublisher publiser = new EventPublisher();
            ArrayList<String> params = new ArrayList<String>();
            params.add("Hello ");
            params.add("world");
            HelloEvent helloEvent = new HelloEvent();
            publiser.addEvent(helloEvent).addEvent(new PrintEvent()).removeEvent(helloEvent).publish(params);
        } catch (EventExcuteError e) {

        }
    }
}
