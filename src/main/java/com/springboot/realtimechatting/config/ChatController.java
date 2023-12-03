package com.springboot.realtimechatting.config;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/chat")
public class ChatController {

    private final ChatService service;

    @PostMapping
    public ChatRoom createRoom(@RequestBody String name){
        System.out.println("createRoom 실행");

        return service.createRoom(name);

    }

    @GetMapping
    public List<ChatRoom> findAllRooms(){
        System.out.println("findAllRooms 실행");

        return service.findAllRoom();
    }
}
