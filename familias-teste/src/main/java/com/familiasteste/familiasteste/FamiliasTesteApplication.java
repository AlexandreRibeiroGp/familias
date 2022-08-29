package com.familiasteste.familiasteste;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.familiasteste.familiasteste"})
public class FamiliasTesteApplication {

	public static void main(String[] args) {
		SpringApplication.run(FamiliasTesteApplication.class, args);
	}

}
