package com.example.nnpia_cv_09_backend.Repository;

import com.example.nnpia_cv_09_backend.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoomRepository extends JpaRepository<Room, Integer> {
    public Room getRoomByRoomId(int roomId);
    public List<Room> findAll();
}
