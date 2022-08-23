package com.example.capstone;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class CapstoneApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CapstoneApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

	}


}
