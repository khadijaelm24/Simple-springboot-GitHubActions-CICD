package com.helloworld.githubactions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GithubactionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GithubactionsApplication.class, args);
		System.out.println("this is a simple app delivered with Docker using GitHub Actions");
	}

}
