package me.aniruddha.kafkaapp.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

	private final Logger logger = LoggerFactory.getLogger(KafkaConsumerService.class);

	@KafkaListener(topics = "test", groupId = "GROUP_ID")
	public void consumer(String message) {
		logger.info("Message consumed: " + message);
	}
}
