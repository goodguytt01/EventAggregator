package com.sunlights.event.core.impl;

import com.sunlights.event.core.EventExcuteError;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Administrator on 2015/4/6.
 */
public class LogErrorHandler{

    private final static Logger logger = LoggerFactory.getLogger(LogErrorHandler.class);

    public static void doError(String errorMsg) throws EventExcuteError {
        logger.error(errorMsg);
        throw new EventExcuteError(errorMsg);
    }
}