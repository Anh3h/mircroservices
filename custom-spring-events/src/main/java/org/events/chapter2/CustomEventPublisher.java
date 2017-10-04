package org.events.chapter2;

import java.util.Date;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class CustomEventPublisher implements ApplicationEventPublisherAware {
	
	protected ApplicationEventPublisher applicationEventPublisher;
	
	@Scheduled(fixedRate = 5000L)
	public void publishEvent() {
		final Date theDate = new Date();
		final int severityLevel = (int) (Math.random() * 10 + 1);
        final CustomEvent customEvent = new CustomEvent(this, "Custom event at: "
            + theDate.toString(), severityLevel);

        System.out.println("CustomEventPublisher - Before publishing CustomEvent");
        applicationEventPublisher.publishEvent(customEvent);
        System.out.println("CustomEventPublisher - After publishing CustomEvent");
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher inApplicationEventPublisher) {
		applicationEventPublisher = inApplicationEventPublisher;
		
	}

}
