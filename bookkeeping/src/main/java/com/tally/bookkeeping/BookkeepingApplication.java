package com.tally.bookkeeping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.tally.bookkeeping.repository", "com.tally.bookkeeping" })
//@EnableMongoRepositories(basePackages = "com.tally.bookkeeping.repository")
public class BookkeepingApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookkeepingApplication.class, args);
	}

}
