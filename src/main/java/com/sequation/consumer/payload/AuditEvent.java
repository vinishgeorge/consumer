package com.sequation.consumer.payload;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor()
@Data
public class AuditEvent {

  @NonNull
  private String correlationId;
  
  @NonNull
  private AuditEventPayload payload;
}
