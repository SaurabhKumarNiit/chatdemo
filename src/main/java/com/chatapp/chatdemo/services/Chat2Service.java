package com.chatapp.chatdemo.services;

import com.chatapp.chatdemo.domain.Chat2;
import com.chatapp.chatdemo.repository.Chat2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Chat2Service {

    @Autowired
    Chat2Repository chat2Repository;

    public Chat2 sendMessage2(Chat2 message) {

        return chat2Repository.save(message);
    }

    public List<Chat2> readMessage2() {

        return chat2Repository.findAll();
    }

}
