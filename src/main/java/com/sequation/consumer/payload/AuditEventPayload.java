package com.sequation.consumer.payload;


import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;

@Data
@Builder
@EqualsAndHashCode
public class AuditEventPayload implements Serializable {

	private static final long serialVersionUID = 9126910072385489305L;

	@NonNull
	protected String userId;

	@NonNull
	protected String userName;

	@NonNull
	protected String serviceName;

	@NonNull
	protected Operations operation;

	@NonNull
	protected String featureName;

	@NonNull
	protected String featureDetails;

//	@NonNull
	protected String serviceUserId;

	@NonNull
	protected LocalDateTime currentDate;

}
