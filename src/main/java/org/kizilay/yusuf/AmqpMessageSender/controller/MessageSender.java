package org.kizilay.yusuf.AmqpMessageSender.controller;

import org.kizilay.yusuf.AmqpMessageSender.entity.Message;
import org.kizilay.yusuf.AmqpMessageSender.service.AmqpSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class MessageSender {

	@Autowired
	private AmqpSender amqpSender;

	@PostMapping(value = "messageSender/message")
	public void sendMessage(@RequestBody Message message) {
		amqpSender.sendMessage(message.getText());
	}

}
