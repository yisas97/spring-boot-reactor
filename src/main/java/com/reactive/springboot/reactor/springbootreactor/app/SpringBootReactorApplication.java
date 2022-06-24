package com.reactive.springboot.reactor.springbootreactor.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.core.publisher.Flux;


@SpringBootApplication
public class SpringBootReactorApplication implements CommandLineRunner {
	
	private  static  final Logger log = LoggerFactory.getLogger(SpringBootReactorApplication.class);
	
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
		//nombres.subscribe(e -> log.info(e));
		nombres.subscribe(log::info);
		
		
		
		
	}
}
