package com.jayadev.AuthApplication.payload.response;

public class MessageResponse
{
    private String messagr;

    public MessageResponse(String messagr) {
        this.messagr = messagr;
    }

    public String getMessagr() {
        return messagr;
    }

    public void setMessagr(String messagr) {
        this.messagr = messagr;
    }
}
