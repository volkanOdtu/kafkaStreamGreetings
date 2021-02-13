package com.davidkiss.streamkafka.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface GreeetingsStreams {

	@Input("greetings-in")
	SubscribableChannel inboundGreetings();
	@Output("greetings-out")
	MessageChannel outboundGreetings();
}
