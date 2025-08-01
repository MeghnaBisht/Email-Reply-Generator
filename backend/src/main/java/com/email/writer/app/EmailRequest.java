package com.email.writer.app;

import lombok.Data;

@Data											//to generate getters setters and constructor 
public class EmailRequest {
	private String emailContent;
	private String tone;
	
//	public String getEmailContent() {
//		return emailContent;
//	}
//	public void setEmailContent(String emailContent) {
//		this.emailContent = emailContent;
//	}
//	public String getTone() {
//		return tone;
//	}
//	public void setTone(String tone) {
//		this.tone = tone;
//	}
}
