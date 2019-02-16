package org.kizilay.yusuf.AmqpMessageSender.service;

import org.kizilay.yusuf.AmqpMessageSender.config.AppConfig;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AmqpSender {

	@Autowired
	private RabbitTemplate rabbitTemplate;

	@Autowired
	private AppConfig appConfig;

	public void sendMessage(String message) {
		rabbitTemplate.convertAndSend(appConfig.getQueueName(), message);
	}

}
