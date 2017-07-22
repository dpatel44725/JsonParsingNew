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
"partition",
"blocks",
"used",
"available",
"use",
"mounted-on"
})
public class DiskInfo {

@JsonProperty("partition")
private String partition;
@JsonProperty("blocks")
private Integer blocks;
@JsonProperty("used")
private Integer used;
@JsonProperty("available")
private Integer available;
@JsonProperty("use")
private String use;
@JsonProperty("mounted-on")
private String mountedOn;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("partition")
public String getPartition() {
return partition;
}

@JsonProperty("partition")
public void setPartition(String partition) {
this.partition = partition;
}

@JsonProperty("blocks")
public Integer getBlocks() {
return blocks;
}

@JsonProperty("blocks")
public void setBlocks(Integer blocks) {
this.blocks = blocks;
}

@JsonProperty("used")
public Integer getUsed() {
return used;
}

@JsonProperty("used")
public void setUsed(Integer used) {
this.used = used;
}

@JsonProperty("available")
public Integer getAvailable() {
return available;
}

@JsonProperty("available")
public void setAvailable(Integer available) {
this.available = available;
}

@JsonProperty("use")
public String getUse() {
return use;
}

@JsonProperty("use")
public void setUse(String use) {
this.use = use;
}

@JsonProperty("mounted-on")
public String getMountedOn() {
return mountedOn;
}

@JsonProperty("mounted-on")
public void setMountedOn(String mountedOn) {
this.mountedOn = mountedOn;
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