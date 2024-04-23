package com.example.nnpia_cv_09_backend.runners;

import com.example.nnpia_cv_09_backend.Repository.RoomRepository;
import com.example.nnpia_cv_09_backend.entity.Message;
import com.example.nnpia_cv_09_backend.entity.Room;
import com.example.nnpia_cv_09_backend.service.MessageService;
import com.example.nnpia_cv_09_backend.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements ApplicationRunner {

    private RoomService roomService;
    private MessageService messageService;

    @Autowired
    public MyRunner(RoomService roomService, MessageService messageService) {
        this.roomService = roomService;
        this.messageService = messageService;
    }

    public void run(ApplicationArguments args) {
        Room room1 = new Room(1);
        roomService.saveRoom(new Room(2));
        roomService.saveRoom(new Room(3));
        roomService.saveRoom(new Room(4));
        Message message = new Message("CAU", room1);
        Message message2 = new Message("CAU CAU", room1);
        room1.getMessages().add(message);
        room1.getMessages().add(message2);

        messageService.saveMessage(message);
        messageService.saveMessage(message2);
        roomService.saveRoom(room1);
    }
}
