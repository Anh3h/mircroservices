package org.events.chapter2;

import org.springframework.context.ApplicationEvent;

@SuppressWarnings("serial")
public class CustomEvent extends ApplicationEvent {
	
	private String eventMsg;
	private int severityLevel;
	
	public CustomEvent(final Object source, final String msg, final int severityLevel) {
		super(source);
		
		if(severityLevel < 1 || severityLevel > 10) {
			throw new IllegalArgumentException("Severity level must be 1 to 10 inclusive");
		}
		
		this.eventMsg = msg;
		this.severityLevel = severityLevel;
	}

	public String getEventMsg() {
		return eventMsg;
	}

	public int getSeverityLevel() {
		return severityLevel;
	}
	
}
