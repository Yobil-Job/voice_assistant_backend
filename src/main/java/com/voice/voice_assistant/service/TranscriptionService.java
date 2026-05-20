package com.voice.voice_assistant.service;

import java.io.File;

import org.springframework.ai.audio.transcription.AudioTranscriptionPrompt;
import org.springframework.ai.audio.transcription.AudioTranscriptionResponse;
import org.springframework.ai.openai.OpenAiAudioTranscriptionModel;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Service;

@Service
public class TranscriptionService {

	private final OpenAiAudioTranscriptionModel transcriptionModel;

	public TranscriptionService(OpenAiAudioTranscriptionModel transcriptionModel) {
		this.transcriptionModel = transcriptionModel;
	}
	public String transcribe(File audioFile) {
		FileSystemResource resource=new FileSystemResource(audioFile);
		AudioTranscriptionPrompt prompt =new AudioTranscriptionPrompt(resource);
		AudioTranscriptionResponse response=transcriptionModel.call(prompt);
		 
		return response.getResult().getOutput();
	}
}
