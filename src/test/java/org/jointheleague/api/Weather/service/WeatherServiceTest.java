package org.jointheleague.api.Weather.service;

import org.jointheleague.api.Weather.repository.WeatherRepository;
import org.jointheleague.api.Weather.repository.dto.Current;
import org.jointheleague.api.Weather.repository.dto.Location;
import org.jointheleague.api.Weather.repository.dto.Weather;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class WeatherServiceTest {

    private WeatherService weatherService;

    @Mock
    private WeatherRepository weatherRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        weatherService = new WeatherService(weatherRepository);
    }


    @Test
    void whenGetResults_ReturnResult() {
        //given
        String query = "Paris";
        Weather result = new Weather();
        result.setLocation(new Location());
        result.setCurrent(new Current());
        Weather expectedResults = result;
        when(weatherRepository.getResults(query))
                .thenReturn(expectedResults);
        //when
        Weather actualResults = weatherService.getResults(query);
        //then
        assertEquals(expectedResults, actualResults);
    }

   }