package com.sequation.consumer.payload;

import java.lang.reflect.Type;

import org.springframework.util.StringUtils;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

public class StringConverter implements JsonDeserializer<String>  {

  @Override
  public String deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
      throws JsonParseException {
    String value = json.getAsJsonPrimitive().getAsString();
    if(StringUtils.isEmpty(value) || value.equals("null")) {
     return null;
    }
    return value;
  }

}
