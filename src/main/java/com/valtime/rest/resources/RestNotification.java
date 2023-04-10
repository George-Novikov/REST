package com.valtime.rest.resources;

import com.valtime.rest.RestApplication;

import javax.management.Notification;

public class RestNotification {
    private Object source;
    private long sequenceNumber;
    private String type;
    private long timeStamp;
    public RestNotification(){}

    public Object getSource() {
        return source;
    }

    public void setSource(Object source) {
        this.source = source;
    }

    public long getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public RestNotification(String type, Object source, long sequenceNumber) {
        this.source = source;
        this.type = type;
        this.sequenceNumber = sequenceNumber ;
        this.timeStamp = (new java.util.Date()).getTime() ;
    }
}
