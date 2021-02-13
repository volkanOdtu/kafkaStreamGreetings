package com.davidkiss.streamkafka.service;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.davidkiss.streamkafka.model.Greetings;

@Component
public class GreetingsListener {
	
	@StreamListener("greetings-in")
	public void handleGreetings(@Payload Greetings greetings) {
		System.out.println("Received greetings:" + greetings);
	}
}
