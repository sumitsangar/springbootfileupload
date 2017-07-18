package com.fileupload;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * @author sumitsangar
 *
 */
@SpringBootApplication
public class SpringBootWebApplication {

	private int maxUploadSizeInMb = 10 * 1024 * 1024; // 10 MB

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringBootWebApplication.class, args);
	}

}