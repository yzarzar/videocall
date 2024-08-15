package com.yarzar.videocall;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.yarzar.videocall.user.User;
import com.yarzar.videocall.user.UserService;

@SpringBootApplication
public class VideocallApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideocallApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(
			UserService service
	) {
		return args -> {
			service.register(User.builder()
							.username("Yarzar")
							.email("yarzar@gmail.com")
							.password("111")
					.build());

			service.register(User.builder()
					.username("Elon")
					.email("elon@gmail.com")
					.password("aaa")
					.build());

			service.register(User.builder()
					.username("Mark")
					.email("mark@gmail.com")
					.password("333")
					.build());
		};
	}

}
