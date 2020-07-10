package com.ls.piggybank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PiggybankApplication{

	public static Total ourTotal;

	public static void main(String[] args) {

		ourTotal = new Total();
		SpringApplication.run(PiggybankApplication.class, args);
	}

}
