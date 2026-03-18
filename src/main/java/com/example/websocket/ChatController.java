package com.example.websocket;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {
    @MessageMapping("/send")
    @SendTo("/topic/message")
    public String sendMessage(String message){
        System.out.println("Am primit mesaj:"+ message);
        return "Serverul spune: "+message;
    }
}
