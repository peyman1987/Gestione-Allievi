package com.peyman.gestione_allievi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class GestioneAllieviApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestioneAllieviApplication.class, args);
	}

	@RequestMapping("/api/hello")
	public String getHello(){
		return "Hello World";
	}

}
