package com.example.guestbook.service;

import com.example.guestbook.entity.Guestbook;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import com.example.guestbook.dto.GuestbookDTO;

@Service
@Log4j2
public class GuestbookServiceImpl {

    @Override
    public Long register(GuestbookDTO dto){
        return null;
    }
}