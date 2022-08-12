package com.one.digitalinovation.projetodesafio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ProjetoDesafioApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoDesafioApplication.class, args);
	}

}
