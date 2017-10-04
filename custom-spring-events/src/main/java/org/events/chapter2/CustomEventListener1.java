package org.events.chapter2;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class CustomEventListener1 implements ApplicationListener<CustomEvent> {

	@Override
	public void onApplicationEvent(CustomEvent customEvent) {
		System.out.println("* An event was received: " + customEvent.getEventMsg()
        + ", severity level: " + customEvent.getSeverityLevel());
		
	}

}
