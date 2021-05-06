package br.com.alura.forum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ForumApplication {

	public static void main(String[] args) {
		System.out.println("Application is Running");
		SpringApplication.run(ForumApplication.class, args);
	}

}
