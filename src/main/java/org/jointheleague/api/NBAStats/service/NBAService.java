package org.jointheleague.api.NBAStats.service;


import org.jointheleague.api.NBAStats.repository.NBARepository;
import org.springframework.stereotype.Service;


//Any sort of parsing of that sort would occur here
@Service
public class NBAService {
    private final NBARepository nbaRepository;
    public NBAService(NBARepository nbaRepository) {
        this.nbaRepository = nbaRepository;
    }
    public String getResults(String query){
        return nbaRepository.getResults(query);
    }

}