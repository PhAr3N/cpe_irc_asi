package com.cpe.market;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan("pojo")
@ComponentScan(basePackages = {"pojo", "repository", "service", "controller", "rest"})
public class CpeMarketApplication {

	public static void main(String[] args) {
		SpringApplication.run(CpeMarketApplication.class, args);
	}

}
