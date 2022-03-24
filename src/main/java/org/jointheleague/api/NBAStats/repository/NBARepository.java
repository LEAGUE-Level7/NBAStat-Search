package org.jointheleague.api.NBAStats.repository;

import org.springframework.stereotype.Repository;
import org.springframework.web.reactive.function.client.WebClient;
@Repository
public class NBARepository {

    private static  WebClient webClient;
    private static final String baseUrl = "https://www.balldontlie.io/api/v1/stats";
    public NBARepository() {
        webClient = WebClient
                .builder()
                .baseUrl(baseUrl)
                .build();
    }
    public String getResults(String query) {
        return webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .queryParam("dates", query)
                        .build()
                )
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }

}