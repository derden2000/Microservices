package pro.antonshu.feign.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FrontEurekaFeignClientApplication {
	public static void main(String[] args) {
		SpringApplication.run(FrontEurekaFeignClientApplication.class, args);
	}
}

