package com.chatapp.chatdemo.services;
import com.chatapp.chatdemo.domain.Items;
import com.chatapp.chatdemo.repository.ItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemsServices {

    @Autowired
    ItemsRepository itemsRepository;

    public Items saveItems(Items items) {

        return itemsRepository.save(items);
    }

    public List<Items> getItems() {

        return itemsRepository.findAll();
    }
}
