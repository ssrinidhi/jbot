package com.paypal.ppsone.bot.core;

import org.junit.Test;

import com.paypal.ppsone.bot.core.EventType;

import static org.junit.Assert.assertEquals;

/**
 *
 */
public class EventTypeTest {

    /**
     * Number of events in {@link EventType} should be
     * equal to the number of events supported by slack
     * plus 3 added by JBot.
     */
    @Test
    public void numberOfEventsType() {
        EventType[] events = EventType.values();
        assertEquals(events.length, 71);
    }

}