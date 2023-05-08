package me.aniruddha.kafkaapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaAdmin;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaProducerController {

	@Autowired
	private KafkaAdmin kafkaAdmin;

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	@PostMapping(value = "/topic")
	public String describeKafkaTopic(@RequestParam("topic") String topic) {
		return kafkaAdmin.describeTopics(topic).toString();
	}

	@PostMapping(value = "/message")
	public void sendMessage(@RequestParam("topic") String topic, @RequestParam("message") String message) {
		kafkaTemplate.send(topic, message);
	}
}