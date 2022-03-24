package org.jointheleague.api.NBAStats.presentation;

import org.jointheleague.api.NBAStats.repository.NBARepository;
import org.jointheleague.api.NBAStats.service.NBAService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;

import java.util.List;

@RestController
public class NBAController {
	private NBAService nbaService;
	
	public NBAController (NBAService nbaService) {
		this.nbaService = nbaService;
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
        return nbaService.getResults(querey);
    }

}