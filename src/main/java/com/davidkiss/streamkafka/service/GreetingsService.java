package com.davidkiss.streamkafka.service;

import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;

import com.davidkiss.streamkafka.model.Greetings;
import com.davidkiss.streamkafka.stream.GreeetingsStreams;

@Service
public class GreetingsService {

	private final GreeetingsStreams greeetingsStreams;
	
	public GreetingsService(GreeetingsStreams greeetingsStreams) {
		this.greeetingsStreams = greeetingsStreams;
	}
	
	public void sendGreeting(final Greetings greetings) {
		
		//"greetings-out"
		MessageChannel messageChannel = greeetingsStreams.outboundGreetings();
		
		messageChannel.send(MessageBuilder.withPayload(greetings)
				.setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON).build() );
				
		System.out.println("Message sent:" + greetings.getMessage() );
	}
}
