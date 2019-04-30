package com.homework.soeprest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.homework.soeprest.console.Console.startConsole;

@SpringBootApplication
public class SoepRestApplication{

	public static void main(String[] args) {

		SpringApplication.run(SoepRestApplication.class, args);
		startConsole();

	}

}
