package org.jointheleague.api.Weather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WeatherStatsApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(WeatherStatsApplication.class, args);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
