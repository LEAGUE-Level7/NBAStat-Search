
package org.jointheleague.api.NBAStats.repository.dto;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "date",
    "home_team_id",
    "home_team_score",
    "season",
    "visitor_team_id",
    "visitor_team_score"
})
@Generated("jsonschema2pojo")
public class Game {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("date")
    private String date;
    @JsonProperty("home_team_id")
    private Integer homeTeamId;
    @JsonProperty("home_team_score")
    private Integer homeTeamScore;
    @JsonProperty("season")
    private Integer season;
    @JsonProperty("visitor_team_id")
    private Integer visitorTeamId;
    @JsonProperty("visitor_team_score")
    private Integer visitorTeamScore;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    @JsonProperty("home_team_id")
    public Integer getHomeTeamId() {
        return homeTeamId;
    }

    @JsonProperty("home_team_id")
    public void setHomeTeamId(Integer homeTeamId) {
        this.homeTeamId = homeTeamId;
    }

    @JsonProperty("home_team_score")
    public Integer getHomeTeamScore() {
        return homeTeamScore;
    }

    @JsonProperty("home_team_score")
    public void setHomeTeamScore(Integer homeTeamScore) {
        this.homeTeamScore = homeTeamScore;
    }

    @JsonProperty("season")
    public Integer getSeason() {
        return season;
    }

    @JsonProperty("season")
    public void setSeason(Integer season) {
        this.season = season;
    }

    @JsonProperty("visitor_team_id")
    public Integer getVisitorTeamId() {
        return visitorTeamId;
    }

    @JsonProperty("visitor_team_id")
    public void setVisitorTeamId(Integer visitorTeamId) {
        this.visitorTeamId = visitorTeamId;
    }

    @JsonProperty("visitor_team_score")
    public Integer getVisitorTeamScore() {
        return visitorTeamScore;
    }

    @JsonProperty("visitor_team_score")
    public void setVisitorTeamScore(Integer visitorTeamScore) {
        this.visitorTeamScore = visitorTeamScore;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
