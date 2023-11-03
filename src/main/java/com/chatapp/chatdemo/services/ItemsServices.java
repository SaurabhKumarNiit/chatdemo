package com.chatapp.chatdemo.services;
import com.chatapp.chatdemo.domain.Items;
import com.chatapp.chatdemo.repository.ItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Items getItemsByCategory(String category){

        return itemsRepository.findByCategory(category);
    }

    public Items updateItem(Items item, int id)  {
        Optional<Items> optionalItem = itemsRepository.findById((long) id);
        if(optionalItem.isEmpty()){
            return null;
        }
        Items existingItem = optionalItem.get();
        if (item.getTitle()!=null){
            existingItem.setTitle(item.getTitle());
        }
        if (item.getPrice()!=null){
            existingItem.setPrice(item.getPrice());
        }
        if (item.getDescription()!=null){
            existingItem.setDescription(item.getDescription());
        }
        if(item.getImage()!=null){
            existingItem.setImage(item.getImage());
        }
        if(item.getCategory()!=null){
            existingItem.setCategory(item.getCategory());
        }

        return itemsRepository.save(existingItem);
    }
}
