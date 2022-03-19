package org.jointheleague.api.NBAStats.presentation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NBAController {

    @GetMapping("/searchNBAStats")


    public String getResults(@RequestParam(value="q") String querey){
        return "Hello, world!" + querey;
    }

}