package ru.netology.dataaccessobject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseAutoConfiguration;

@SpringBootApplication
public class DataAccessObjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataAccessObjectApplication.class, args);
	}

}
