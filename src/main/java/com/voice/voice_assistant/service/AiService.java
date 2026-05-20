package com.voice.voice_assistant.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class AiService {
	
	private final ChatClient chatClient;

	public AiService(ChatClient.Builder chatClient) {
		this.chatClient = chatClient.build();
	}
	
	public String askAi(String message) {
		
		return chatClient.prompt()
		.user(message)
		.call()
		.content();
	}

}
