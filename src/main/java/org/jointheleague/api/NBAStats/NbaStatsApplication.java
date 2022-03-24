package org.jointheleague.api.NBAStats;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NbaStatsApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(NbaStatsApplication.class, args);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
