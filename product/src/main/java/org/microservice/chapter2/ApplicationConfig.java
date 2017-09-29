package org.microservice.chapter2;

import javax.inject.Named;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
	
	@Named
	static class JerseyConfig extends ResourceConfig {
		public JerseyConfig() {
			this.packages("org.microservice.chapter2.rest");
		}
	}

}