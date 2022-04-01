package org.jointheleague.api.Weather.repository;


import org.jointheleague.api.Weather.repository.dto.Current;
import org.jointheleague.api.Weather.repository.dto.Location;
import org.jointheleague.api.Weather.repository.dto.Weather;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.UriBuilder;
import reactor.core.publisher.Mono;

import java.net.URI;
import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;


public class WeatherRepositoryTest {
    private WeatherRepository weatherRepository;

    @Mock
    WebClient webClientMock;

    @Mock
    WebClient.RequestHeadersUriSpec requestHeadersUriSpecMock;

    @Mock
    WebClient.RequestHeadersSpec requestHeadersSpecMock;

    @Mock
    WebClient.ResponseSpec responseSpecMock;

    @Mock
    Mono<Weather> WeatherMonoMock;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);

        weatherRepository = new WeatherRepository(webClientMock);
    }
    @Test
    void whenGetResults_thenReturnLocResponse() {
        //given
        String query = "Java";
        Weather weather = new Weather();
        Location l = new Location();
        l.setCountry("France");
        l.setName("Paris");
        weather.setLocation(l);
        Current c  = new Current();
        c.setTempF(100.00);
        c.setHumidity(76);
        weather.setCurrent(c);
        Weather expectedResults = weather;

        when(webClientMock.get())
                .thenReturn(requestHeadersUriSpecMock);
        when(requestHeadersUriSpecMock.uri((Function<UriBuilder, URI>) any()))
                .thenReturn(requestHeadersSpecMock);
        when(requestHeadersSpecMock.retrieve())
                .thenReturn(responseSpecMock);
        when(responseSpecMock.bodyToMono(Weather.class))
                .thenReturn(WeatherMonoMock);
        when(WeatherMonoMock.block())
                .thenReturn(weather);

        //when
        Weather actual = weatherRepository.getResults(query);

        //then
        assertEquals(expectedResults, weather);
    }

}
