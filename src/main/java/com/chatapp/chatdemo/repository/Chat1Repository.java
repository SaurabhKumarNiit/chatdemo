package com.chatapp.chatdemo.repository;

import com.chatapp.chatdemo.domain.Chat1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Chat1Repository extends JpaRepository<Chat1,Long> {

}
