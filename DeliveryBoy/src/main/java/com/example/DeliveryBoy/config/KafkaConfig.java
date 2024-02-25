package com.example.DeliveryBoy.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

	@Bean
	public NewTopic topic() {
		return TopicBuilder
				.name(AppConstents.LOCATION_UPDATE_TOPIC)
				.partitions(3)
				.replicas(2)
				.build();
	}
}
	