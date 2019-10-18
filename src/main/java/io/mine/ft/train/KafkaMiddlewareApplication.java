package io.mine.ft.train;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class KafkaMiddlewareApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaMiddlewareApplication.class, args);
	}

}
