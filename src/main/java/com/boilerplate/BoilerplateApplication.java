package com.boilerplate;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BoilerplateApplication {

	public static void main(String[] args) {

		//log.getLogging().info(BoilerplateApplication.class.getName()+"Class instantiated by the Spring Application");
		SpringApplication.run(BoilerplateApplication.class, args);
	}
}
