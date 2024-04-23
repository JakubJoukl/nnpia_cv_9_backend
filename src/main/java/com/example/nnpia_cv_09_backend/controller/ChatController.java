package com.example.nnpia_cv_09_backend.controller;

import com.example.nnpia_cv_09_backend.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class ChatController {
    @Autowired
    private RoomService roomService;

    @GetMapping("/rooms/{id}")
    public ResponseEntity<?> getRoomById(@PathVariable Integer id){
        return new ResponseEntity<>(roomService.getRoomById(id), HttpStatus.OK);
    }

    @GetMapping("/rooms/")
    public ResponseEntity<?> getAllRooms(){
        return new ResponseEntity<>(roomService.getAllRooms(), HttpStatus.OK);
    }
}
