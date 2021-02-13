package com.davidkiss.streamkafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

import com.davidkiss.streamkafka.stream.GreeetingsStreams;

@SpringBootApplication
@EnableBinding(GreeetingsStreams.class)
public class StreamkafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(StreamkafkaApplication.class, args);
	}

}
