package com.git.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class GitcicdApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitcicdApplication.class, args);
	}

}
