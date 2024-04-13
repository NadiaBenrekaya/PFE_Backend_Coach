package com.proxym.project;

import com.proxym.project.security.auth.AuthenticationService;
import com.proxym.project.security.auth.RegisterRequest;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import static com.proxym.project.security.user.Role.ADMIN;
import static com.proxym.project.security.user.Role.COACH;

@SpringBootApplication
public class ProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}

	/*@Bean
	public CommandLineRunner commandLineRunner(
			AuthenticationService service
	) {
		return args -> {
			var admin = RegisterRequest.builder()
					.firstname("Admin")
					.lastname("Admin")
					.email("admin@mail.com")
					.password("password")
					.role(ADMIN)
					.build();
			System.out.println("Admin token: "+ service.register(admin).getAccessToken());

			var coach = RegisterRequest.builder()
					.firstname("Admin")
					.lastname("Admin")
					.email("coach@mail.com")
					.password("password")
					.role(COACH)
					.build();
			System.out.println("Coach token: "+ service.register(coach).getAccessToken());
		};
	}*/
}
