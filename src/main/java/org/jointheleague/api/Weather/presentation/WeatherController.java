package org.jointheleague.api.Weather.presentation;

import org.jointheleague.api.Weather.service.WeatherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
public class WeatherController {
	private WeatherService weatherService;
	
	public WeatherController (WeatherService weatherService) {
		this.weatherService = weatherService;
	}
    @GetMapping("/searchNBAStats")
    @ApiOperation(value = "Statistics of the specific request from the NBA",
    notes = "Response may include multiple Result values.",
    response = String.class)
    /*
    @ApiResponses(value = {
    		@ApiResponse(code = 200, message = "Result(s) found"),
    		@ApiResponse(code = 404, message = "Result(s) not found")
    })
    */
    public String getResults(@RequestParam(value="q") String querey){
        return weatherService.getResults(querey);
    }

}