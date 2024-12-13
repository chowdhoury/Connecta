package com.exosoft.connecta;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.exosoft.connecta.user.User;
import com.exosoft.connecta.user.UserService;

@SpringBootApplication
public class VideocallingprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideocallingprojectApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunnerr(UserService service) {
		return args -> {
					service.register(User.builder()
					.username("test")
					.email("test@mail.com")
					.password("test")
					.build());
		};
	}

}
