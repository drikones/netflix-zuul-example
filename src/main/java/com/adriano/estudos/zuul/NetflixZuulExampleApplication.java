package com.adriano.estudos.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 
 * @author Adriano Rocha
 * @since 23/02/2020
 * 
 * Projeto feito com base no encontrado no blog https://emmanuelneri.com.br/2018/05/02/criando-proxy-de-apis-com-spring-cloud-zuul-e-eureka/
 */
@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class NetflixZuulExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetflixZuulExampleApplication.class, args);
	}

}
