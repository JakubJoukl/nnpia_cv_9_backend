package com.example.nnpia_cv_09_backend.entity;

import jakarta.persistence.*;

@Entity
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer messageId;

    @Column
    private String content;

    @ManyToOne
    @JoinColumn(name="room_id", nullable=false)
    private Room room;

    public Message(String content, Room room) {
        this.content = content;
        this.room = room;
    }

    public Message(Integer messageId, String content, Room room) {
        this.messageId = messageId;
        this.content = content;
        this.room = room;
    }

    public Message() {
    }

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
