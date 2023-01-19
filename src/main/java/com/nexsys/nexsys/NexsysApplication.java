package com.nexsys.nexsys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@EnableJpaRepositories("com.nexsys.nexsys")
@EntityScan("com.nexsys.nexsys")
public class NexsysApplication {

	public static void main(String[] args) {
		SpringApplication.run(NexsysApplication.class, args);
	}

}
