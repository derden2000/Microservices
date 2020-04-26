package pro.antonshu.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
public class GeekEurekaClientApplication {
	public static void main(String[] args) {
		SpringApplication.run(GeekEurekaClientApplication.class, args);
	}
}

