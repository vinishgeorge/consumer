package com.sequation.consumer;

import java.util.function.Consumer;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sequation.consumer.payload.AuditEvent;

@Configuration
public class Sink {
	private static final Log LOGGER = LogFactory.getLog(Sink.class);

	@Bean
	public Consumer<AuditEvent> logAuditMessage() {
		return auditMessage -> {

			LOGGER.info(String.format("New message received from %s: %s at %s",
					auditMessage.getPayload().getFeatureDetails(),
					auditMessage.getCorrelationId()+" "+auditMessage.getPayload().getFeatureName() + " " + auditMessage.getPayload().getServiceName() + " "
							+ auditMessage.getPayload().getServiceUserId() +
							" " + auditMessage.getPayload().getUserId() + " " + auditMessage.getPayload().getUserName() + " "
							+ auditMessage.getPayload().getOperation(),
					auditMessage.getPayload().getCurrentDate()));
		};
	}
}
