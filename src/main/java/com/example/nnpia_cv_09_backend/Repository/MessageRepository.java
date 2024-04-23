package com.example.nnpia_cv_09_backend.Repository;


import com.example.nnpia_cv_09_backend.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Integer> {

}
