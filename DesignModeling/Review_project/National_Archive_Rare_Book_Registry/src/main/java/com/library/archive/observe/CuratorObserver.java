package com.library.archive.observe;

public class CuratorObserver {

    private String latestMessage;

    public void update(String message) {
        latestMessage = message;
    }

    public String getLatestMessage() {
        return latestMessage;
    }
}