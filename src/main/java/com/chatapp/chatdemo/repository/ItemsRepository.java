package com.chatapp.chatdemo.repository;

import com.chatapp.chatdemo.domain.Items;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemsRepository extends JpaRepository<Items,Long> {
    Items findByCategory(String category);
}
