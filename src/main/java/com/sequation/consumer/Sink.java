package com.sequation.consumer;

import java.util.function.Consumer;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sequation.consumer.model.UserMessage;

@Configuration
public class Sink {
    private static final Log LOGGER = LogFactory.getLog(Sink.class);

	@Bean
	public Consumer<UserMessage> logUserMessage() {
		return userMessage -> {

			LOGGER.info(String.format("New message received from %s: %s at %s",
					userMessage.getUsername(), userMessage.getBody(), userMessage.getCreatedAt()));
		};
	}
}
