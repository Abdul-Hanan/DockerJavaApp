package pk.com.rest.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages={"pk.com.rest"})
public class RestfullDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfullDockerApplication.class, args);
	}

}
