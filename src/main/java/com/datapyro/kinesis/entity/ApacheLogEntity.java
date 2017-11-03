package com.datapyro.kinesis.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "ApacheLogs")
public class ApacheLogEntity {

    @DynamoDBAutoGeneratedKey
    @DynamoDBHashKey
    private String hashId;

    @DynamoDBAttribute
    private String ipAddress;

    @DynamoDBAttribute
    private String clientId;

    @DynamoDBAttribute
    private String userID;

    @DynamoDBAttribute
    private String dateTime;

    @DynamoDBAttribute
    private String method;

    @DynamoDBAttribute
    private String endpoint;

    @DynamoDBAttribute
    private String protocol;

    @DynamoDBAttribute
    private Integer responseCode;

    @DynamoDBAttribute
    private Long contentSize;

    @DynamoDBAttribute
    private String url;

    public String getHashId() {
        return hashId;
    }

    public ApacheLogEntity setHashId(String hashId) {
        this.hashId = hashId;
        return this;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public ApacheLogEntity setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    public String getClientId() {
        return clientId;
    }

    public ApacheLogEntity setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    public String getUserID() {
        return userID;
    }

    public ApacheLogEntity setUserID(String userID) {
        this.userID = userID;
        return this;
    }

    public String getDateTime() {
        return dateTime;
    }

    public ApacheLogEntity setDateTime(String dateTime) {
        this.dateTime = dateTime;
        return this;
    }

    public String getMethod() {
        return method;
    }

    public ApacheLogEntity setMethod(String method) {
        this.method = method;
        return this;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public ApacheLogEntity setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    public String getProtocol() {
        return protocol;
    }

    public ApacheLogEntity setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    public Integer getResponseCode() {
        return responseCode;
    }

    public ApacheLogEntity setResponseCode(Integer responseCode) {
        this.responseCode = responseCode;
        return this;
    }

    public Long getContentSize() {
        return contentSize;
    }

    public ApacheLogEntity setContentSize(Long contentSize) {
        this.contentSize = contentSize;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public ApacheLogEntity setUrl(String url) {
        this.url = url;
        return this;
    }
    
}
