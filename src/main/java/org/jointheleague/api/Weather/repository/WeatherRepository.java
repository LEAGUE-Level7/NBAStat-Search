package org.jointheleague.api.Weather.repository;


import org.jointheleague.api.Weather.repository.dto.Weather;
import org.springframework.stereotype.Repository;
import org.springframework.web.reactive.function.client.WebClient;
@Repository
public class WeatherRepository {

    private static  WebClient webClient;
    private static final String baseUrl = "https://api.weatherapi.com/v1/current.json";
    private static final String APIKey = "7e066fd98e57480b8b2194510222603";
    public WeatherRepository() {
        webClient = WebClient
                .builder()
                .baseUrl(baseUrl)
                .build();
    }
    public WeatherRepository(WebClient webClientMock) {
        this.webClient = webClientMock;
    }

    public Weather getResults(String query) {
        try {
            return webClient.get()
                    .uri(uriBuilder -> uriBuilder
                            .queryParam("key", APIKey)
                            .queryParam("q", query)
                            .build()
                    )
                    .retrieve()
                    .bodyToMono(Weather.class)
                    .block();
        } catch (Exception e){
            return null;
        }
    }

}