package br.com.felipe.mvc.sprgmvc2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching //habilita para que a consulta seja cacheada
@SpringBootApplication
public class Sprgmvc2Application {

	public static void main(String[] args) {
		SpringApplication.run(Sprgmvc2Application.class, args);
	}

}
