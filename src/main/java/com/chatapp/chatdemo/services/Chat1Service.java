package com.chatapp.chatdemo.services;

import com.chatapp.chatdemo.domain.Chat1;
import com.chatapp.chatdemo.repository.Chat1Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Chat1Service {

    @Autowired
    Chat1Repository chat1Repository;

    public Chat1 sendMessage1(Chat1 message) {

        return chat1Repository.save(message);
    }

    public List<Chat1> readMessage1() {

        return chat1Repository.findAll();
    }

}
