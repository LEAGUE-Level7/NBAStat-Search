package org.jointheleague.api.Weather.presentation;


import org.jointheleague.api.Weather.repository.dto.Current;
import org.jointheleague.api.Weather.repository.dto.Location;
import org.jointheleague.api.Weather.repository.dto.Weather;
import org.jointheleague.api.Weather.service.WeatherService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import java.util.Collections;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@WebMvcTest(WeatherController.class)
public class WeatherControllerIntTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private WeatherService weatherService;

    @Test
    public void givenGoodQuery_whenSearchForResults_thenIsOkAndReturnsResults() throws Exception {
        //given
        String query = "Paris";
        Weather result = new Weather();
        Location l = new Location();
        l.setCountry("France");
        l.setTzId("Europe/Paris");
        l.setLon(2.33);
        result.setLocation(l);
        // Current cannot be checked as it is not a piece of information which will stay the same at all times
        result.setCurrent(new Current());
        Weather expectedResults = result;

        when(weatherService.getResults(query))
                .thenReturn(expectedResults);
        //when
        //then
        MvcResult mvcResult = mockMvc.perform(get("/searchWeather?q=" + query))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("location.country", is(l.getCountry())))
                .andExpect(jsonPath("location.tz_id", is(l.getTzId())))
                .andExpect(jsonPath("location.lon", is(l.getLon())))
                .andReturn();

        assertEquals(MediaType.APPLICATION_JSON_VALUE, mvcResult.getResponse().getContentType());
    }
    @Test
    public void givenBadQuery_whenSearchForResults_thenIsNotFound() throws Exception {
        //given
        String query = "Java";

        //when
        //then
        mockMvc.perform(get("/searchWeather?q=" + query))
                .andDo(print())
                .andExpect(status().isNotFound());
    }

}

