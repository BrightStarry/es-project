package com.zx.es;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class EsProjectApplication {

	@GetMapping("/")
	public String test() {
		return "test";
	}

	public static void main(String[] args) {
		SpringApplication.run(EsProjectApplication.class, args);
	}
}
