package fr.miage.m1.big_data_m1_23_24;

import fr.miage.m1.big_data_m1_23_24.entity.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BigDataM12324Application {

	public static void main(String[] args) {
		SpringApplication.run(BigDataM12324Application.class, args);
	}

	@Bean
	CommandLineRunner start(UserRepository userRepository, FileRepository fileRepository) {
		return args -> {
			User user = User.builder().firstname("John").lastname("Doe").build();
			userRepository.save(user);
			fileRepository.save(user);
		};
	}

}
