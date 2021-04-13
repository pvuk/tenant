package com.thoughts.tenant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * @author P.V. UdayKiran
 * @version 1, created on Tue 13-Apr-2021 21:51
 */
@SpringBootApplication
public class TenantApplication {

	public static void main(String[] args) {
		System.setProperty("spring.devtools.restart.enabled", "false");//Avoid Breakpoint at “throw new SilentExitException()” in Eclipse + Spring Boot
		SpringApplication.run(TenantApplication.class, args);
	}

}
