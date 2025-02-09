package com.apache.kafka.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	@GetMapping("/message/{publishMessage}")
	public String publishMessage(@PathVariable String publishMessage) {
		
		kafkaTemplate.send("helloTopic",publishMessage);
		return "Message Published: "+publishMessage;
	}
}
