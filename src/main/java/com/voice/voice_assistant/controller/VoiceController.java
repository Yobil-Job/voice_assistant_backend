package com.voice.voice_assistant.controller;

import java.io.File;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.voice.voice_assistant.service.AiService;
import com.voice.voice_assistant.service.TranscriptionService;

@RestController 
@RequestMapping("/api/voice")
public class VoiceController {

	private final AiService aiService;
	private final TranscriptionService transcriptionService;
	public VoiceController(AiService aiService, TranscriptionService transcriptionService) {
		this.aiService = aiService;
		this.transcriptionService = transcriptionService;
	}
	
	@PostMapping(
            value = "/chat",
            consumes = MediaType.MULTIPART_FORM_DATA_VALUE
    )
    public String voiceChat(
            @RequestParam("file") MultipartFile file
    ) throws Exception {

        File tempFile = File.createTempFile("audio", ".wav");

        file.transferTo(tempFile);

        String transcription =transcriptionService.transcribe(tempFile);
   
        String aiResponse = 
                aiService.askAi(transcription);

        return aiResponse;
    }
	
	
}
