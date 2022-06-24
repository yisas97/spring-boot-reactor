package com.reactive.springboot.reactor.springbootreactor.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.core.publisher.Flux;

@SpringBootApplication
public class SpringBootReactorApplication implements CommandLineRunner {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootReactorApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		// Metodo Just creamos nuevos flujo de datos
		//Flux<String> nombres = Flux.just("Jesus","Junior","Carlos","Genaro","Cristhian", "Andres")
		//		.doOnNext(e -> System.out.println(e));
		//Factorizado
		Flux<String> nombres = Flux.just("Jesus","Junior","Carlos","Genaro","Cristhian", "Andres")
				.doOnNext(System.out::println);
		//Cada vez que recibimos que nos notifique
		
		//Nos subscribismo
		nombres.subscribe();
		
		
		
		
	}
}
