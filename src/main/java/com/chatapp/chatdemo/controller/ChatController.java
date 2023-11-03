package com.chatapp.chatdemo.controller;

import com.chatapp.chatdemo.domain.Chat1;
import com.chatapp.chatdemo.domain.Chat2;
import com.chatapp.chatdemo.domain.Items;
import com.chatapp.chatdemo.services.Chat1Service;
import com.chatapp.chatdemo.services.Chat2Service;
import com.chatapp.chatdemo.services.ItemsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@CrossOrigin("https://saurabhkumarniit.github.io")
@CrossOrigin("http://localhost:3000/")

public class ChatController {

    @Autowired
    Chat1Service chat1Service;

    @Autowired
    Chat2Service chat2Service;

    @Autowired
    ItemsServices itemsServices;

    @PostMapping("/sendMessage1")
    public ResponseEntity<?> sendMessage1(@RequestBody Chat1 chat1) {
        Chat1 sendMessage1 = chat1Service.sendMessage1(chat1);
        return new ResponseEntity<>(sendMessage1, HttpStatus.CREATED);
    }

    @GetMapping("/readMessage1")
    public List<Chat1> readAllMessage1() {
        return chat1Service.readMessage1();
    }


    @PostMapping("/sendMessage2")
    public ResponseEntity<?> sendMessage2(@RequestBody Chat2 chat2) {
        Chat2 sendMessage2 = chat2Service.sendMessage2(chat2);
        return new ResponseEntity<>(sendMessage2, HttpStatus.CREATED);
    }

    @GetMapping("/readMessage2")
    public List<Chat2> readAllMessage2() {
        return chat2Service.readMessage2();
    }


    @PostMapping("/saveItems")
    public ResponseEntity<?> SaveItems(@RequestBody Items items) {
        Items items1 = itemsServices.saveItems(items);
        return new ResponseEntity<>(items1, HttpStatus.CREATED);
    }

    @GetMapping("/getItems")
    public List<Items> getItems() {
        return itemsServices.getItems();
    }


    @GetMapping("/items/{category}")
    public ResponseEntity<?> getItemsByCategory(@PathVariable String category) {
        try {
            return new ResponseEntity<>(itemsServices.getItemsByCategory(category), HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/updateItem/{id}")
    public ResponseEntity<?> updateItem(@RequestBody Items item,@PathVariable int id) {
        return new ResponseEntity<>(itemsServices.updateItem(item,id),HttpStatus.CREATED);
    }
}