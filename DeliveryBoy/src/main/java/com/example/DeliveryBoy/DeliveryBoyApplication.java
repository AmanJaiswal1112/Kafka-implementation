package com.example.DeliveryBoy;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;

@SpringBootApplication
public class DeliveryBoyApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeliveryBoyApplication.class, args);
	}
	
	
	@Bean
public NewTopic getNewTopic() {
	
		return TopicBuilder
				.name("LocationUpdateTopic")
	//			.partitions(0)
		//		.replicas(0)
				.build();
}

}
