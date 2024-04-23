package com.example.nnpia_cv_09_backend.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Integer roomId;

    @OneToMany(mappedBy = "room")
    private List<Message> messages = new ArrayList<>();

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public Room(Integer roomId) {
        this.roomId = roomId;
    }

    public Room() {

    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }
}
