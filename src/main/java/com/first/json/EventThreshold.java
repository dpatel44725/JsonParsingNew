package com.first.json;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"name",
"set-value",
"clear-value",
"set-percentage",
"clear-percentage",
"set-value-float",
"clear-value-float"
})
public class EventThreshold {

@JsonProperty("name")
private String name;
@JsonProperty("set-value")
private int setValue;
@JsonProperty("clear-value")
private int clearValue;
@JsonProperty("set-percentage")
private int setPercentage;
@JsonProperty("clear-percentage")
private int clearPercentage;
@JsonProperty("set-value-float")
private int setValueFloat;
@JsonProperty("clear-value-float")
private int clearValueFloat;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("name")
public String getName() {
return name;
}

@JsonProperty("name")
public void setName(String name) {
this.name = name;
}

@JsonProperty("set-value")
public int getSetValue() {
return setValue;
}

@JsonProperty("set-value")
public void setSetValue(int setValue) {
this.setValue = setValue;
}

@JsonProperty("clear-value")
public int getClearValue() {
return clearValue;
}

@JsonProperty("clear-value")
public void setClearValue(int clearValue) {
this.clearValue = clearValue;
}

@JsonProperty("set-percentage")
public int getSetPercentage() {
return setPercentage;
}

@JsonProperty("set-percentage")
public void setSetPercentage(int setPercentage) {
this.setPercentage = setPercentage;
}

@JsonProperty("clear-percentage")
public int getClearPercentage() {
return clearPercentage;
}

@JsonProperty("clear-percentage")
public void setClearPercentage(int clearPercentage) {
this.clearPercentage = clearPercentage;
}

@JsonProperty("set-value-float")
public int getSetValueFloat() {
return setValueFloat;
}

@JsonProperty("set-value-float")
public void setSetValueFloat(int setValueFloat) {
this.setValueFloat = setValueFloat;
}

@JsonProperty("clear-value-float")
public int getClearValueFloat() {
return clearValueFloat;
}

@JsonProperty("clear-value-float")
public void setClearValueFloat(int clearValueFloat) {
this.clearValueFloat = clearValueFloat;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}