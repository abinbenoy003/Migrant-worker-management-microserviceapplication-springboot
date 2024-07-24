package com.ust.Application_cloud_config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ApplicationCloudConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationCloudConfigApplication.class, args);
	}

}
