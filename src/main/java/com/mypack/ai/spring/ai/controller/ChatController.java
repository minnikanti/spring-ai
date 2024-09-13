package com.mypack.ai.spring.ai.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {

    private ChatClient chatClient;

    public ChatController(ChatClient.Builder chatClientBuilder) {
        this.chatClient = chatClientBuilder.build();
    }

    @PostMapping("/chat")
    public String chatWithOllama(@RequestBody String message) {
        return this.chatClient.prompt()
                .user(message)
                .call()
                .content();
    }
}
