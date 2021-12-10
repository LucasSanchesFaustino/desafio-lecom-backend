package br.com.ShopAll.microservice.ShopAll_Catalogo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ShopAllCatalogoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopAllCatalogoApplication.class, args);
	}

}
