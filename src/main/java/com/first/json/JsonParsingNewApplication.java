package com.first.json;

import java.util.Timer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JsonParsingNewApplication {

	public static void main(String[] args) {
		SpringApplication.run(JsonParsingNewApplication.class, args);
		
		ExecutorService executor = Executors.newFixedThreadPool(4);
		Runnable map = new FileReadService();
		
		executor.execute(map);
		executor.shutdown();
		
		Timer time = new Timer();
		
		time.schedule(new Scheduler(), 0, 5000);
		 
		

	}
}


