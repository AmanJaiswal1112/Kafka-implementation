package com.example.endUser.config;

import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConsumerConfig {
	
	

	@KafkaListener(topics = AppConstents.LOCATION_UPDATE_TOPIC, groupId = AppConstents.GROUP_ID)
	public void updatedLocation(String value) {
	
		System.out.println(value);
	}
	
}
