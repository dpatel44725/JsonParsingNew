package com.first.json;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonPropertyOrder({
"config-status",
"max-disk-usage",
"spool-while-charging",
"spool-without-flash",
"using-internal-disk",
"disk-array-wwn",
"operational-status",
"datapath-up",
"synchronization-status",
"max-message-count",
"message-count-utilization-percentage",
"transaction-resource-utilization-percentage",
"transacted-session-resource-utilization-percentage",
"transacted-session-count-utilization-percentage",
"delivered-unacked-msgs-utilization-percentage",
"spool-files-utilization-percentage",
"active-disk-partition-usage",
"standby-disk-partition-usage",
"next-message-id",
"num-delete-in-progress",
"max-message-spool-entities",
"message-spool-entities-allowed-by-qendpt",
"message-spool-entities-used-by-queue",
"message-spool-entities-used-by-dte",
"transacted-sessions-used",
"max-transacted-sessions",
"transacted-sessions-local-used",
"transacted-sessions-xa-used",
"transactions-used",
"max-transactions",
"transactions-local-used",
"transactions-xa-used",
"sequenced-topics-used",
"max-sequenced-topics",
"queue-topic-subscriptions-used",
"max-queue-topic-subscriptions",
"ingress-flow-count",
"ingress-flows-allowed",
"flows-allowed",
"active-flow-count",
"inactive-flow-count",
"browser-flow-count",
"cvrid-config-ready",
"card-ready",
"flash-module-ready",
"power-module-ready",
"card-contents-ready",
"local-contents-key",
"mate-contents-key",
"router-schema-match",
"disk-ready",
"disk-contents-status",
"disk-key-primary",
"disk-key-backup",
"last-failure-reason",
"last-failure-time",
"current-rfad-usage",
"current-disk-usage",
"current-persist-usage",
"rfad-messages-currently-spooled",
"disk-messages-currently-spooled",
"total-messages-currently-spooled",
"disk-infos",
"spool-files",
"cache-status",
"max-cache-usage",
"current-cache-usage",
"cache-high-water-mark",
"event-configuration"
})
public class MessagePool {

@JsonProperty("config-status")
private String configStatus;
@JsonProperty("max-disk-usage")
private int maxDiskUsage;
@JsonProperty("spool-while-charging")
private Boolean spoolWhileCharging;
@JsonProperty("spool-without-flash")
private Boolean spoolWithoutFlash;
@JsonProperty("using-internal-disk")
private Boolean usingInternalDisk;
@JsonProperty("disk-array-wwn")
private String diskArrayWwn;
@JsonProperty("operational-status")
private String operationalStatus;
@JsonProperty("datapath-up")
private Boolean datapathUp;
@JsonProperty("synchronization-status")
private String synchronizationStatus;
@JsonProperty("max-message-count")
private String maxMessageCount;
@JsonProperty("message-count-utilization-percentage")
private String messageCountUtilizationPercentage;
@JsonProperty("transaction-resource-utilization-percentage")
private String transactionResourceUtilizationPercentage;
@JsonProperty("transacted-session-resource-utilization-percentage")
private String transactedSessionResourceUtilizationPercentage;
@JsonProperty("transacted-session-count-utilization-percentage")
private String transactedSessionCountUtilizationPercentage;
@JsonProperty("delivered-unacked-msgs-utilization-percentage")
private String deliveredUnackedMsgsUtilizationPercentage;
@JsonProperty("spool-files-utilization-percentage")
private String spoolFilesUtilizationPercentage;
@JsonProperty("active-disk-partition-usage")
private String activeDiskPartitionUsage;
@JsonProperty("standby-disk-partition-usage")
private String standbyDiskPartitionUsage;
@JsonProperty("next-message-id")
private long nextMessageId;
@JsonProperty("num-delete-in-progress")
private int numDeleteInProgress;
@JsonProperty("max-message-spool-entities")
private int maxMessageSpoolEntities;
@JsonProperty("message-spool-entities-allowed-by-qendpt")
private int messageSpoolEntitiesAllowedByQendpt;
@JsonProperty("message-spool-entities-used-by-queue")
private int messageSpoolEntitiesUsedByQueue;
@JsonProperty("message-spool-entities-used-by-dte")
private int messageSpoolEntitiesUsedByDte;
@JsonProperty("transacted-sessions-used")
private int transactedSessionsUsed;
@JsonProperty("max-transacted-sessions")
private int maxTransactedSessions;
@JsonProperty("transacted-sessions-local-used")
private int transactedSessionsLocalUsed;
@JsonProperty("transacted-sessions-xa-used")
private int transactedSessionsXaUsed;
@JsonProperty("transactions-used")
private int transactionsUsed;
@JsonProperty("max-transactions")
private int maxTransactions;
@JsonProperty("transactions-local-used")
private int transactionsLocalUsed;
@JsonProperty("transactions-xa-used")
private int transactionsXaUsed;
@JsonProperty("sequenced-topics-used")
private int sequencedTopicsUsed;
@JsonProperty("max-sequenced-topics")
private int maxSequencedTopics;
@JsonProperty("queue-topic-subscriptions-used")
private int queueTopicSubscriptionsUsed;
@JsonProperty("max-queue-topic-subscriptions")
private int maxQueueTopicSubscriptions;
@JsonProperty("ingress-flow-count")
private int ingressFlowCount;
@JsonProperty("ingress-flows-allowed")
private int ingressFlowsAllowed;
@JsonProperty("flows-allowed")
private int flowsAllowed;
@JsonProperty("active-flow-count")
private int activeFlowCount;
@JsonProperty("inactive-flow-count")
private int inactiveFlowCount;
@JsonProperty("browser-flow-count")
private int browserFlowCount;
@JsonProperty("cvrid-config-ready")
private Boolean cvridConfigReady;
@JsonProperty("card-ready")
private Boolean cardReady;
@JsonProperty("flash-module-ready")
private Boolean flashModuleReady;
@JsonProperty("power-module-ready")
private Boolean powerModuleReady;
@JsonProperty("card-contents-ready")
private Boolean cardContentsReady;
@JsonProperty("local-contents-key")
private String localContentsKey;
@JsonProperty("mate-contents-key")
private String mateContentsKey;
@JsonProperty("router-schema-match")
private Boolean routerSchemaMatch;
@JsonProperty("disk-ready")
private Boolean diskReady;
@JsonProperty("disk-contents-status")
private String diskContentsStatus;
@JsonProperty("disk-key-primary")
private String diskKeyPrimary;
@JsonProperty("disk-key-backup")
private String diskKeyBackup;
@JsonProperty("last-failure-reason")
private String lastFailureReason;
@JsonProperty("last-failure-time")
private String lastFailureTime;
@JsonProperty("current-rfad-usage")
private Double currentRfadUsage;
@JsonProperty("current-disk-usage")
private Double currentDiskUsage;
@JsonProperty("current-persist-usage")
private Double currentPersistUsage;
@JsonProperty("rfad-messages-currently-spooled")
private int rfadMessagesCurrentlySpooled;
@JsonProperty("disk-messages-currently-spooled")
private int diskMessagesCurrentlySpooled;
@JsonProperty("total-messages-currently-spooled")
private int totalMessagesCurrentlySpooled;
@JsonProperty("disk-infos")
private DiskInfos diskInfos;
@JsonProperty("spool-files")
private List<SpoolFile> spoolFiles = null;
@JsonProperty("cache-status")
private String cacheStatus;
@JsonProperty("max-cache-usage")
private int maxCacheUsage;
@JsonProperty("current-cache-usage")
private String currentCacheUsage;
@JsonProperty("cache-high-water-mark")
private String cacheHighWaterMark;
@JsonProperty("event-configuration")
private EventConfiguration eventConfiguration;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("config-status")
public String getConfigStatus() {
return configStatus;
}

@JsonProperty("config-status")
public void setConfigStatus(String configStatus) {
this.configStatus = configStatus;
}

@JsonProperty("max-disk-usage")
public int getMaxDiskUsage() {
return maxDiskUsage;
}

@JsonProperty("max-disk-usage")
public void setMaxDiskUsage(int maxDiskUsage) {
this.maxDiskUsage = maxDiskUsage;
}

@JsonProperty("spool-while-charging")
public Boolean getSpoolWhileCharging() {
return spoolWhileCharging;
}

@JsonProperty("spool-while-charging")
public void setSpoolWhileCharging(Boolean spoolWhileCharging) {
this.spoolWhileCharging = spoolWhileCharging;
}

@JsonProperty("spool-without-flash")
public Boolean getSpoolWithoutFlash() {
return spoolWithoutFlash;
}

@JsonProperty("spool-without-flash")
public void setSpoolWithoutFlash(Boolean spoolWithoutFlash) {
this.spoolWithoutFlash = spoolWithoutFlash;
}

@JsonProperty("using-internal-disk")
public Boolean getUsingInternalDisk() {
return usingInternalDisk;
}

@JsonProperty("using-internal-disk")
public void setUsingInternalDisk(Boolean usingInternalDisk) {
this.usingInternalDisk = usingInternalDisk;
}

@JsonProperty("disk-array-wwn")
public String getDiskArrayWwn() {
return diskArrayWwn;
}

@JsonProperty("disk-array-wwn")
public void setDiskArrayWwn(String diskArrayWwn) {
this.diskArrayWwn = diskArrayWwn;
}

@JsonProperty("operational-status")
public String getOperationalStatus() {
return operationalStatus;
}

@JsonProperty("operational-status")
public void setOperationalStatus(String operationalStatus) {
this.operationalStatus = operationalStatus;
}

@JsonProperty("datapath-up")
public Boolean getDatapathUp() {
return datapathUp;
}

@JsonProperty("datapath-up")
public void setDatapathUp(Boolean datapathUp) {
this.datapathUp = datapathUp;
}

@JsonProperty("synchronization-status")
public String getSynchronizationStatus() {
return synchronizationStatus;
}

@JsonProperty("synchronization-status")
public void setSynchronizationStatus(String synchronizationStatus) {
this.synchronizationStatus = synchronizationStatus;
}

@JsonProperty("max-message-count")
public String getMaxMessageCount() {
return maxMessageCount;
}

@JsonProperty("max-message-count")
public void setMaxMessageCount(String maxMessageCount) {
this.maxMessageCount = maxMessageCount;
}

@JsonProperty("message-count-utilization-percentage")
public String getMessageCountUtilizationPercentage() {
return messageCountUtilizationPercentage;
}

@JsonProperty("message-count-utilization-percentage")
public void setMessageCountUtilizationPercentage(String messageCountUtilizationPercentage) {
this.messageCountUtilizationPercentage = messageCountUtilizationPercentage;
}

@JsonProperty("transaction-resource-utilization-percentage")
public String getTransactionResourceUtilizationPercentage() {
return transactionResourceUtilizationPercentage;
}

@JsonProperty("transaction-resource-utilization-percentage")
public void setTransactionResourceUtilizationPercentage(String transactionResourceUtilizationPercentage) {
this.transactionResourceUtilizationPercentage = transactionResourceUtilizationPercentage;
}

@JsonProperty("transacted-session-resource-utilization-percentage")
public String getTransactedSessionResourceUtilizationPercentage() {
return transactedSessionResourceUtilizationPercentage;
}

@JsonProperty("transacted-session-resource-utilization-percentage")
public void setTransactedSessionResourceUtilizationPercentage(String transactedSessionResourceUtilizationPercentage) {
this.transactedSessionResourceUtilizationPercentage = transactedSessionResourceUtilizationPercentage;
}

@JsonProperty("transacted-session-count-utilization-percentage")
public String getTransactedSessionCountUtilizationPercentage() {
return transactedSessionCountUtilizationPercentage;
}

@JsonProperty("transacted-session-count-utilization-percentage")
public void setTransactedSessionCountUtilizationPercentage(String transactedSessionCountUtilizationPercentage) {
this.transactedSessionCountUtilizationPercentage = transactedSessionCountUtilizationPercentage;
}

@JsonProperty("delivered-unacked-msgs-utilization-percentage")
public String getDeliveredUnackedMsgsUtilizationPercentage() {
return deliveredUnackedMsgsUtilizationPercentage;
}

@JsonProperty("delivered-unacked-msgs-utilization-percentage")
public void setDeliveredUnackedMsgsUtilizationPercentage(String deliveredUnackedMsgsUtilizationPercentage) {
this.deliveredUnackedMsgsUtilizationPercentage = deliveredUnackedMsgsUtilizationPercentage;
}

@JsonProperty("spool-files-utilization-percentage")
public String getSpoolFilesUtilizationPercentage() {
return spoolFilesUtilizationPercentage;
}

@JsonProperty("spool-files-utilization-percentage")
public void setSpoolFilesUtilizationPercentage(String spoolFilesUtilizationPercentage) {
this.spoolFilesUtilizationPercentage = spoolFilesUtilizationPercentage;
}

@JsonProperty("active-disk-partition-usage")
public String getActiveDiskPartitionUsage() {
return activeDiskPartitionUsage;
}

@JsonProperty("active-disk-partition-usage")
public void setActiveDiskPartitionUsage(String activeDiskPartitionUsage) {
this.activeDiskPartitionUsage = activeDiskPartitionUsage;
}

@JsonProperty("standby-disk-partition-usage")
public String getStandbyDiskPartitionUsage() {
return standbyDiskPartitionUsage;
}

@JsonProperty("standby-disk-partition-usage")
public void setStandbyDiskPartitionUsage(String standbyDiskPartitionUsage) {
this.standbyDiskPartitionUsage = standbyDiskPartitionUsage;
}

@JsonProperty("next-message-id")
public long getNextMessageId() {
return nextMessageId;
}

@JsonProperty("next-message-id")
public void setNextMessageId(long nextMessageId) {
this.nextMessageId = nextMessageId;
}

@JsonProperty("num-delete-in-progress")
public int getNumDeleteInProgress() {
return numDeleteInProgress;
}

@JsonProperty("num-delete-in-progress")
public void setNumDeleteInProgress(int numDeleteInProgress) {
this.numDeleteInProgress = numDeleteInProgress;
}

@JsonProperty("max-message-spool-entities")
public int getMaxMessageSpoolEntities() {
return maxMessageSpoolEntities;
}

@JsonProperty("max-message-spool-entities")
public void setMaxMessageSpoolEntities(int maxMessageSpoolEntities) {
this.maxMessageSpoolEntities = maxMessageSpoolEntities;
}

@JsonProperty("message-spool-entities-allowed-by-qendpt")
public int getMessageSpoolEntitiesAllowedByQendpt() {
return messageSpoolEntitiesAllowedByQendpt;
}

@JsonProperty("message-spool-entities-allowed-by-qendpt")
public void setMessageSpoolEntitiesAllowedByQendpt(int messageSpoolEntitiesAllowedByQendpt) {
this.messageSpoolEntitiesAllowedByQendpt = messageSpoolEntitiesAllowedByQendpt;
}

@JsonProperty("message-spool-entities-used-by-queue")
public int getMessageSpoolEntitiesUsedByQueue() {
return messageSpoolEntitiesUsedByQueue;
}

@JsonProperty("message-spool-entities-used-by-queue")
public void setMessageSpoolEntitiesUsedByQueue(int messageSpoolEntitiesUsedByQueue) {
this.messageSpoolEntitiesUsedByQueue = messageSpoolEntitiesUsedByQueue;
}

@JsonProperty("message-spool-entities-used-by-dte")
public int getMessageSpoolEntitiesUsedByDte() {
return messageSpoolEntitiesUsedByDte;
}

@JsonProperty("message-spool-entities-used-by-dte")
public void setMessageSpoolEntitiesUsedByDte(int messageSpoolEntitiesUsedByDte) {
this.messageSpoolEntitiesUsedByDte = messageSpoolEntitiesUsedByDte;
}

@JsonProperty("transacted-sessions-used")
public int getTransactedSessionsUsed() {
return transactedSessionsUsed;
}

@JsonProperty("transacted-sessions-used")
public void setTransactedSessionsUsed(int transactedSessionsUsed) {
this.transactedSessionsUsed = transactedSessionsUsed;
}

@JsonProperty("max-transacted-sessions")
public int getMaxTransactedSessions() {
return maxTransactedSessions;
}

@JsonProperty("max-transacted-sessions")
public void setMaxTransactedSessions(int maxTransactedSessions) {
this.maxTransactedSessions = maxTransactedSessions;
}

@JsonProperty("transacted-sessions-local-used")
public int getTransactedSessionsLocalUsed() {
return transactedSessionsLocalUsed;
}

@JsonProperty("transacted-sessions-local-used")
public void setTransactedSessionsLocalUsed(int transactedSessionsLocalUsed) {
this.transactedSessionsLocalUsed = transactedSessionsLocalUsed;
}

@JsonProperty("transacted-sessions-xa-used")
public int getTransactedSessionsXaUsed() {
return transactedSessionsXaUsed;
}

@JsonProperty("transacted-sessions-xa-used")
public void setTransactedSessionsXaUsed(int transactedSessionsXaUsed) {
this.transactedSessionsXaUsed = transactedSessionsXaUsed;
}

@JsonProperty("transactions-used")
public int getTransactionsUsed() {
return transactionsUsed;
}

@JsonProperty("transactions-used")
public void setTransactionsUsed(int transactionsUsed) {
this.transactionsUsed = transactionsUsed;
}

@JsonProperty("max-transactions")
public int getMaxTransactions() {
return maxTransactions;
}

@JsonProperty("max-transactions")
public void setMaxTransactions(int maxTransactions) {
this.maxTransactions = maxTransactions;
}

@JsonProperty("transactions-local-used")
public int getTransactionsLocalUsed() {
return transactionsLocalUsed;
}

@JsonProperty("transactions-local-used")
public void setTransactionsLocalUsed(int transactionsLocalUsed) {
this.transactionsLocalUsed = transactionsLocalUsed;
}

@JsonProperty("transactions-xa-used")
public int getTransactionsXaUsed() {
return transactionsXaUsed;
}

@JsonProperty("transactions-xa-used")
public void setTransactionsXaUsed(int transactionsXaUsed) {
this.transactionsXaUsed = transactionsXaUsed;
}

@JsonProperty("sequenced-topics-used")
public int getSequencedTopicsUsed() {
return sequencedTopicsUsed;
}

@JsonProperty("sequenced-topics-used")
public void setSequencedTopicsUsed(int sequencedTopicsUsed) {
this.sequencedTopicsUsed = sequencedTopicsUsed;
}

@JsonProperty("max-sequenced-topics")
public int getMaxSequencedTopics() {
return maxSequencedTopics;
}

@JsonProperty("max-sequenced-topics")
public void setMaxSequencedTopics(int maxSequencedTopics) {
this.maxSequencedTopics = maxSequencedTopics;
}

@JsonProperty("queue-topic-subscriptions-used")
public int getQueueTopicSubscriptionsUsed() {
return queueTopicSubscriptionsUsed;
}

@JsonProperty("queue-topic-subscriptions-used")
public void setQueueTopicSubscriptionsUsed(int queueTopicSubscriptionsUsed) {
this.queueTopicSubscriptionsUsed = queueTopicSubscriptionsUsed;
}

@JsonProperty("max-queue-topic-subscriptions")
public int getMaxQueueTopicSubscriptions() {
return maxQueueTopicSubscriptions;
}

@JsonProperty("max-queue-topic-subscriptions")
public void setMaxQueueTopicSubscriptions(int maxQueueTopicSubscriptions) {
this.maxQueueTopicSubscriptions = maxQueueTopicSubscriptions;
}

@JsonProperty("ingress-flow-count")
public int getIngressFlowCount() {
return ingressFlowCount;
}

@JsonProperty("ingress-flow-count")
public void setIngressFlowCount(int ingressFlowCount) {
this.ingressFlowCount = ingressFlowCount;
}

@JsonProperty("ingress-flows-allowed")
public int getIngressFlowsAllowed() {
return ingressFlowsAllowed;
}

@JsonProperty("ingress-flows-allowed")
public void setIngressFlowsAllowed(int ingressFlowsAllowed) {
this.ingressFlowsAllowed = ingressFlowsAllowed;
}

@JsonProperty("flows-allowed")
public int getFlowsAllowed() {
return flowsAllowed;
}

@JsonProperty("flows-allowed")
public void setFlowsAllowed(int flowsAllowed) {
this.flowsAllowed = flowsAllowed;
}

@JsonProperty("active-flow-count")
public int getActiveFlowCount() {
return activeFlowCount;
}

@JsonProperty("active-flow-count")
public void setActiveFlowCount(int activeFlowCount) {
this.activeFlowCount = activeFlowCount;
}

@JsonProperty("inactive-flow-count")
public int getInactiveFlowCount() {
return inactiveFlowCount;
}

@JsonProperty("inactive-flow-count")
public void setInactiveFlowCount(int inactiveFlowCount) {
this.inactiveFlowCount = inactiveFlowCount;
}

@JsonProperty("browser-flow-count")
public int getBrowserFlowCount() {
return browserFlowCount;
}

@JsonProperty("browser-flow-count")
public void setBrowserFlowCount(int browserFlowCount) {
this.browserFlowCount = browserFlowCount;
}

@JsonProperty("cvrid-config-ready")
public Boolean getCvridConfigReady() {
return cvridConfigReady;
}

@JsonProperty("cvrid-config-ready")
public void setCvridConfigReady(Boolean cvridConfigReady) {
this.cvridConfigReady = cvridConfigReady;
}

@JsonProperty("card-ready")
public Boolean getCardReady() {
return cardReady;
}

@JsonProperty("card-ready")
public void setCardReady(Boolean cardReady) {
this.cardReady = cardReady;
}

@JsonProperty("flash-module-ready")
public Boolean getFlashModuleReady() {
return flashModuleReady;
}

@JsonProperty("flash-module-ready")
public void setFlashModuleReady(Boolean flashModuleReady) {
this.flashModuleReady = flashModuleReady;
}

@JsonProperty("power-module-ready")
public Boolean getPowerModuleReady() {
return powerModuleReady;
}

@JsonProperty("power-module-ready")
public void setPowerModuleReady(Boolean powerModuleReady) {
this.powerModuleReady = powerModuleReady;
}

@JsonProperty("card-contents-ready")
public Boolean getCardContentsReady() {
return cardContentsReady;
}

@JsonProperty("card-contents-ready")
public void setCardContentsReady(Boolean cardContentsReady) {
this.cardContentsReady = cardContentsReady;
}

@JsonProperty("local-contents-key")
public String getLocalContentsKey() {
return localContentsKey;
}

@JsonProperty("local-contents-key")
public void setLocalContentsKey(String localContentsKey) {
this.localContentsKey = localContentsKey;
}

@JsonProperty("mate-contents-key")
public String getMateContentsKey() {
return mateContentsKey;
}

@JsonProperty("mate-contents-key")
public void setMateContentsKey(String mateContentsKey) {
this.mateContentsKey = mateContentsKey;
}

@JsonProperty("router-schema-match")
public Boolean getRouterSchemaMatch() {
return routerSchemaMatch;
}

@JsonProperty("router-schema-match")
public void setRouterSchemaMatch(Boolean routerSchemaMatch) {
this.routerSchemaMatch = routerSchemaMatch;
}

@JsonProperty("disk-ready")
public Boolean getDiskReady() {
return diskReady;
}

@JsonProperty("disk-ready")
public void setDiskReady(Boolean diskReady) {
this.diskReady = diskReady;
}

@JsonProperty("disk-contents-status")
public String getDiskContentsStatus() {
return diskContentsStatus;
}

@JsonProperty("disk-contents-status")
public void setDiskContentsStatus(String diskContentsStatus) {
this.diskContentsStatus = diskContentsStatus;
}

@JsonProperty("disk-key-primary")
public String getDiskKeyPrimary() {
return diskKeyPrimary;
}

@JsonProperty("disk-key-primary")
public void setDiskKeyPrimary(String diskKeyPrimary) {
this.diskKeyPrimary = diskKeyPrimary;
}

@JsonProperty("disk-key-backup")
public String getDiskKeyBackup() {
return diskKeyBackup;
}

@JsonProperty("disk-key-backup")
public void setDiskKeyBackup(String diskKeyBackup) {
this.diskKeyBackup = diskKeyBackup;
}

@JsonProperty("last-failure-reason")
public String getLastFailureReason() {
return lastFailureReason;
}

@JsonProperty("last-failure-reason")
public void setLastFailureReason(String lastFailureReason) {
this.lastFailureReason = lastFailureReason;
}

@JsonProperty("last-failure-time")
public String getLastFailureTime() {
return lastFailureTime;
}

@JsonProperty("last-failure-time")
public void setLastFailureTime(String lastFailureTime) {
this.lastFailureTime = lastFailureTime;
}

@JsonProperty("current-rfad-usage")
public Double getCurrentRfadUsage() {
return currentRfadUsage;
}

@JsonProperty("current-rfad-usage")
public void setCurrentRfadUsage(Double currentRfadUsage) {
this.currentRfadUsage = currentRfadUsage;
}

@JsonProperty("current-disk-usage")
public Double getCurrentDiskUsage() {
return currentDiskUsage;
}

@JsonProperty("current-disk-usage")
public void setCurrentDiskUsage(Double currentDiskUsage) {
this.currentDiskUsage = currentDiskUsage;
}

@JsonProperty("current-persist-usage")
public Double getCurrentPersistUsage() {
return currentPersistUsage;
}

@JsonProperty("current-persist-usage")
public void setCurrentPersistUsage(Double currentPersistUsage) {
this.currentPersistUsage = currentPersistUsage;
}

@JsonProperty("rfad-messages-currently-spooled")
public int getRfadMessagesCurrentlySpooled() {
return rfadMessagesCurrentlySpooled;
}

@JsonProperty("rfad-messages-currently-spooled")
public void setRfadMessagesCurrentlySpooled(int rfadMessagesCurrentlySpooled) {
this.rfadMessagesCurrentlySpooled = rfadMessagesCurrentlySpooled;
}

@JsonProperty("disk-messages-currently-spooled")
public int getDiskMessagesCurrentlySpooled() {
return diskMessagesCurrentlySpooled;
}

@JsonProperty("disk-messages-currently-spooled")
public void setDiskMessagesCurrentlySpooled(int diskMessagesCurrentlySpooled) {
this.diskMessagesCurrentlySpooled = diskMessagesCurrentlySpooled;
}

@JsonProperty("total-messages-currently-spooled")
public int getTotalMessagesCurrentlySpooled() {
return totalMessagesCurrentlySpooled;
}

@JsonProperty("total-messages-currently-spooled")
public void setTotalMessagesCurrentlySpooled(int totalMessagesCurrentlySpooled) {
this.totalMessagesCurrentlySpooled = totalMessagesCurrentlySpooled;
}

@JsonProperty("disk-infos")
public DiskInfos getDiskInfos() {
return diskInfos;
}

@JsonProperty("disk-infos")
public void setDiskInfos(DiskInfos diskInfos) {
this.diskInfos = diskInfos;
}

@JsonProperty("spool-files")
public List<SpoolFile> getSpoolFiles() {
return spoolFiles;
}

@JsonProperty("spool-files")
public void setSpoolFiles(List<SpoolFile> spoolFiles) {
this.spoolFiles = spoolFiles;
}

@JsonProperty("cache-status")
public String getCacheStatus() {
return cacheStatus;
}

@JsonProperty("cache-status")
public void setCacheStatus(String cacheStatus) {
this.cacheStatus = cacheStatus;
}

@JsonProperty("max-cache-usage")
public int getMaxCacheUsage() {
return maxCacheUsage;
}

@JsonProperty("max-cache-usage")
public void setMaxCacheUsage(int maxCacheUsage) {
this.maxCacheUsage = maxCacheUsage;
}

@JsonProperty("current-cache-usage")
public String getCurrentCacheUsage() {
return currentCacheUsage;
}

@JsonProperty("current-cache-usage")
public void setCurrentCacheUsage(String currentCacheUsage) {
this.currentCacheUsage = currentCacheUsage;
}

@JsonProperty("cache-high-water-mark")
public String getCacheHighWaterMark() {
return cacheHighWaterMark;
}

@JsonProperty("cache-high-water-mark")
public void setCacheHighWaterMark(String cacheHighWaterMark) {
this.cacheHighWaterMark = cacheHighWaterMark;
}

@JsonProperty("event-configuration")
public EventConfiguration getEventConfiguration() {
return eventConfiguration;
}

@JsonProperty("event-configuration")
public void setEventConfiguration(EventConfiguration eventConfiguration) {
this.eventConfiguration = eventConfiguration;
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