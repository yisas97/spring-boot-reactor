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
		Flux<String> nombres = Flux.just("Jesus","Junior","Carlos","Maria","Cristhian", "Andres")
				.doOnNext((e) -> {
					//Si es vacio una de las palabras, dara el error
					if(e.isEmpty()){
						throw  new RuntimeException("Los nombres no pueden ser vacios");
					}
				});
		//Cada vez que recibimos que nos notifique
		
		//Nos subscribismo
		//nombres.subscribe(e -> log.info(e));
		//Cuando consuma el observable sino realizar alguna acción
		// subcribe(next , error)
		nombres.subscribe(log::info,
				error -> log.error(error.getMessage()),
				new Runnable() {
					@Override
					public void run() {
						log.info("Ha finalizado la ejecución!!!!");
						
					}
				}
				
				//() -> log.info("Se completo con exito la transacción!!!!!!")
		
		
		);
		
	}
}
