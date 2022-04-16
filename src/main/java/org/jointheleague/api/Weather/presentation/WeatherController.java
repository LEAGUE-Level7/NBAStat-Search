package org.jointheleague.api.Weather.presentation;

import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.jointheleague.api.Weather.repository.dto.Weather;
import org.jointheleague.api.Weather.service.WeatherService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class WeatherController {
	private WeatherService weatherService;
	
	public WeatherController (WeatherService weatherService) {
		this.weatherService = weatherService;
	}
    @GetMapping("/searchWeather")
    @ApiOperation(value = "Weather information from a specific location",
        response = Weather.class)
    @ApiResponses(value = {
    		@ApiResponse(code = 200, message = "Result(s) found."),
    		@ApiResponse(code = 404, message = "Result(s) not found."),
    })
    public Weather getResults(@RequestParam(value="q") String query){
        Weather output = weatherService.getResults(query);
        if(output==null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Result(s) not found.");
        }

        return output;
    }

}