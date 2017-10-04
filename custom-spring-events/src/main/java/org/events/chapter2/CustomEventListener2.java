package org.events.chapter2;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class CustomEventListener2 {

	/**
     * Handles the received {@link MultiLevelEvent} that has a severity level of 3 or less.
     *
     * @param customEvent Received event.
     */
    @EventListener(condition = "#customEvent.severityLevel <= 3")
    public void handleLowSeverityEvents(final CustomEvent customEvent) {
        System.out.println("* A low-severity event was received: " + customEvent.getEventMsg()
        + ", severity level: " + customEvent.getSeverityLevel());
    }
    
    @EventListener()
    public void handleEvents(final CustomEvent customEvent) {
        System.out.println("* An event was received: " + customEvent.getEventMsg()
        + ", severity level: " + customEvent.getSeverityLevel());
    }

}
