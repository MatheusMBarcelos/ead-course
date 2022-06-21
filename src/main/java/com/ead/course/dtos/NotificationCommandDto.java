package com.ead.course.dtos;

import java.util.UUID;

public class NotificationCommandDto {

    private String title;
    private String message;
    private UUID userId;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public String getMessage() {
        return message;
    }

    public UUID getUserId() {
        return userId;
    }
}
