package com.trendytechie.micorservices.springcloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


@SpringBootApplication
@EnableConfigServer
public class TrendytechieSpringCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrendytechieSpringCloudConfigServerApplication.class, args);
	}

}
