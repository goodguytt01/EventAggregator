package com.sunlights.event;

import com.sunlights.event.core.EventExcuteError;

/**
 * Created by Edward on 2015/4/2.
 */
public interface Event {

    public Object excute(Object o, int step) throws EventExcuteError;
    
}
