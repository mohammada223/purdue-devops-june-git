package com.aquasec.purdue_devops_june_git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PurdueDevopsJuneGitApplication {

	public static void main(String[] args) {
		SpringApplication.run(PurdueDevopsJuneGitApplication.class, args);
	}
	
	@GetMapping("/")
    public String hello() {
      return String.format("Hello this is a first GIT sample project");
    }
	
	@GetMapping("/Hello") // second commit from abc

    public String hello1() {
      return String.format("Hello this is another message for the GIT sample project");
    }

}
