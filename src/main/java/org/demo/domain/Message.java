package org.demo.domain;

public class Message {
	private String messageType;
	private Object content;

	public Message(String messageType, Object content) {
		this.messageType = messageType;
		this.content = content;
	}

	public String getMessageType() {
		return messageType;
	}

	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}

	public Object getContent() {
		return content;
	}

	public void setContent(Object content) {
		this.content = content;
	}
}
