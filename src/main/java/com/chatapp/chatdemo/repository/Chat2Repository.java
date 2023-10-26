package com.chatapp.chatdemo.repository;

import com.chatapp.chatdemo.domain.Chat2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Chat2Repository extends JpaRepository<Chat2,Long> {
}
