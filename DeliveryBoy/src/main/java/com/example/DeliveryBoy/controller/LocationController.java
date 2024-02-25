package com.example.DeliveryBoy.controller;

import java.util.Map;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.DeliveryBoy.service.KafkaService;

@RestController
@RequestMapping("/location")
public class LocationController {

	@Autowired
	private KafkaService kafkaService;
	
	private Logger logger = LoggerFactory.getLogger(LocationController.class);
	
	@PostMapping("/update")
	public ResponseEntity<?> updateLocation(){
		
		for(int i = 1 ; i < 5 ; i++) {
		String location = +Math.round(Math.random()*100) +" , " +Math.round(Math.random()*100) ;
		this.kafkaService.updateLocation("("+location+")");
		}
		
		
		return new ResponseEntity<>( HttpStatus.OK);
	}
	
	@PostMapping("/cabUpdate")
	public String updateLocationForCab(){
		
		for(int i = 1 ; i < 5 ; i++) {
		String location = +Math.round(Math.random()*100) +" , " +Math.round(Math.random()*100) ;
		this.kafkaService.updateLocation("("+location+")");
		}
		
		
		return "location produce";
	}
}
