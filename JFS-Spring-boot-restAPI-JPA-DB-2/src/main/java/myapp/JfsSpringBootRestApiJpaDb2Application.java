package myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan({"entity","controller","service","repository"})
public class JfsSpringBootRestApiJpaDb2Application {

	public static void main(String[] args) {
		SpringApplication.run(JfsSpringBootRestApiJpaDb2Application.class, args);
	}

}
