package org.jointheleague.api.Weather.service;


import org.jointheleague.api.Weather.repository.WeatherRepository;
import org.jointheleague.api.Weather.repository.dto.Weather;
import org.springframework.stereotype.Service;


//Any sort of parsing of that sort would occur here
@Service
public class WeatherService {
    private final WeatherRepository weatherRepository;
    public WeatherService(WeatherRepository weatherRepository) {
        this.weatherRepository = weatherRepository;
    }
    public Weather getResults(String query){
        Weather w =  weatherRepository.getResults(query);
        return w;
    }

}