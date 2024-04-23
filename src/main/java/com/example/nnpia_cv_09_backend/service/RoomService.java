package com.example.nnpia_cv_09_backend.service;

import com.example.nnpia_cv_09_backend.Repository.RoomRepository;
import com.example.nnpia_cv_09_backend.entity.Message;
import com.example.nnpia_cv_09_backend.entity.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {
    @Autowired
    private RoomRepository roomRepository;
    public Room getRoomById(int id){
        return roomRepository.getRoomByRoomId(id);
    }

    public List<Room> getAllRooms(){
        return roomRepository.findAll();
    }

    public void saveRoom(Room room){
        roomRepository.save(room);
    }
}
