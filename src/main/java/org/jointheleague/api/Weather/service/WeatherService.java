package org.jointheleague.api.Weather.service;


import org.jointheleague.api.Weather.repository.WeatherRepository;
import org.springframework.stereotype.Service;


//Any sort of parsing of that sort would occur here
@Service
public class WeatherService {
    private final WeatherRepository weatherRepository;
    public WeatherService(WeatherRepository weatherRepository) {
        this.weatherRepository = weatherRepository;
    }
    public String getResults(String query){
        return weatherRepository.getResults(query);
    }

}