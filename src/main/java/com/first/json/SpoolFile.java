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
"primary-used",
"primary-used-percent",
"primary-pending-delete",
"backup-used",
"backup-used-percent",
"backup-pending-delete",
"total-maximum",
"total-used",
"total-available",
"total-used-percent",
"total-pending-delete"
})
public class SpoolFile {

@JsonProperty("primary-used")
private int primaryUsed;
@JsonProperty("primary-used-percent")
private int primaryUsedPercent;
@JsonProperty("primary-pending-delete")
private int primaryPendingDelete;
@JsonProperty("backup-used")
private int backupUsed;
@JsonProperty("backup-used-percent")
private int backupUsedPercent;
@JsonProperty("backup-pending-delete")
private int backupPendingDelete;
@JsonProperty("total-maximum")
private int totalMaximum;
@JsonProperty("total-used")
private int totalUsed;
@JsonProperty("total-available")
private int totalAvailable;
@JsonProperty("total-used-percent")
private int totalUsedPercent;
@JsonProperty("total-pending-delete")
private int totalPendingDelete;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("primary-used")
public int getPrimaryUsed() {
return primaryUsed;
}

@JsonProperty("primary-used")
public void setPrimaryUsed(int primaryUsed) {
this.primaryUsed = primaryUsed;
}

@JsonProperty("primary-used-percent")
public int getPrimaryUsedPercent() {
return primaryUsedPercent;
}

@JsonProperty("primary-used-percent")
public void setPrimaryUsedPercent(int primaryUsedPercent) {
this.primaryUsedPercent = primaryUsedPercent;
}

@JsonProperty("primary-pending-delete")
public int getPrimaryPendingDelete() {
return primaryPendingDelete;
}

@JsonProperty("primary-pending-delete")
public void setPrimaryPendingDelete(int primaryPendingDelete) {
this.primaryPendingDelete = primaryPendingDelete;
}

@JsonProperty("backup-used")
public int getBackupUsed() {
return backupUsed;
}

@JsonProperty("backup-used")
public void setBackupUsed(int backupUsed) {
this.backupUsed = backupUsed;
}

@JsonProperty("backup-used-percent")
public int getBackupUsedPercent() {
return backupUsedPercent;
}

@JsonProperty("backup-used-percent")
public void setBackupUsedPercent(int backupUsedPercent) {
this.backupUsedPercent = backupUsedPercent;
}

@JsonProperty("backup-pending-delete")
public int getBackupPendingDelete() {
return backupPendingDelete;
}

@JsonProperty("backup-pending-delete")
public void setBackupPendingDelete(int backupPendingDelete) {
this.backupPendingDelete = backupPendingDelete;
}

@JsonProperty("total-maximum")
public int getTotalMaximum() {
return totalMaximum;
}

@JsonProperty("total-maximum")
public void setTotalMaximum(int totalMaximum) {
this.totalMaximum = totalMaximum;
}

@JsonProperty("total-used")
public int getTotalUsed() {
return totalUsed;
}

@JsonProperty("total-used")
public void setTotalUsed(int totalUsed) {
this.totalUsed = totalUsed;
}

@JsonProperty("total-available")
public int getTotalAvailable() {
return totalAvailable;
}

@JsonProperty("total-available")
public void setTotalAvailable(int totalAvailable) {
this.totalAvailable = totalAvailable;
}

@JsonProperty("total-used-percent")
public int getTotalUsedPercent() {
return totalUsedPercent;
}

@JsonProperty("total-used-percent")
public void setTotalUsedPercent(int totalUsedPercent) {
this.totalUsedPercent = totalUsedPercent;
}

@JsonProperty("total-pending-delete")
public int getTotalPendingDelete() {
return totalPendingDelete;
}

@JsonProperty("total-pending-delete")
public void setTotalPendingDelete(int totalPendingDelete) {
this.totalPendingDelete = totalPendingDelete;
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



