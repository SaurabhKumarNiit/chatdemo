package com.chatapp.chatdemo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Chat1 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String message;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Chat1(long id, String message) {
        this.id = id;
        this.message = message;
    }

    public Chat1() {
    }

    @Override
    public String toString() {
        return "Chat{" +
                "id=" + id +
                ", message='" + message + '\'' +
                '}';
    }
}
