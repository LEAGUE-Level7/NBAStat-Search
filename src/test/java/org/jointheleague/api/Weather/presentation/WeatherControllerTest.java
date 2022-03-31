package org.jointheleague.api.Weather.presentation;

import org.jointheleague.api.Weather.repository.dto.Current;
import org.jointheleague.api.Weather.repository.dto.Location;
import org.jointheleague.api.Weather.repository.dto.Weather;
import org.jointheleague.api.Weather.service.WeatherService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.web.server.ResponseStatusException;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class HomeControllerTest {

    private WeatherController weatherController;

    @Mock
    private WeatherService weatherService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        weatherController = new WeatherController(weatherService);
    }

    @Test
    void givenGoodQuery_whenGetResults_thenReturnListOfResults() {
        //given
        String query = "Java";
        Weather result = new Weather();
        result.setLocation(new Location());
        result.setCurrent(new Current());
        Weather expectedResults = result;

        when(weatherService.getResults(query))
                .thenReturn(expectedResults);

        //when
        Weather actualResults = weatherController.getResults(query);

        //then
        assertEquals(expectedResults, actualResults);
    }

    @Test
    void givenBadQuery_whenGetResults_thenThrowsException() {
        //given
        String query = "Java";

        //when
        when(weatherService.getResults(query))
                .thenReturn(null);
        //then
        Throwable exceptionThrown = assertThrows(ResponseStatusException.class, () -> weatherController.getResults(query));
        assertEquals(exceptionThrown.getMessage(), "404 NOT_FOUND \"Result(s) not found.\"");
    }

}