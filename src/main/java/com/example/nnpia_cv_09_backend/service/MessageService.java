package com.example.nnpia_cv_09_backend.service;

import com.example.nnpia_cv_09_backend.Repository.MessageRepository;
import com.example.nnpia_cv_09_backend.entity.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    @Autowired
    private MessageRepository messageRepository;
    public void saveMessage(Message message){
        messageRepository.save(message);
    }
}
