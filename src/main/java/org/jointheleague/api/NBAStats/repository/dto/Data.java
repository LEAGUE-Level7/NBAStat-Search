
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
    "ast",
    "blk",
    "dreb",
    "fg3_pct",
    "fg3a",
    "fg3m",
    "fg_pct",
    "fga",
    "fgm",
    "ft_pct",
    "fta",
    "ftm",
    "game",
    "min",
    "oreb",
    "pf",
    "player",
    "pts",
    "reb",
    "stl",
    "team",
    "turnover"
})
@Generated("jsonschema2pojo")
public class Data {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("ast")
    private Integer ast;
    @JsonProperty("blk")
    private Integer blk;
    @JsonProperty("dreb")
    private Integer dreb;
    @JsonProperty("fg3_pct")
    private Double fg3Pct;
    @JsonProperty("fg3a")
    private Integer fg3a;
    @JsonProperty("fg3m")
    private Integer fg3m;
    @JsonProperty("fg_pct")
    private Double fgPct;
    @JsonProperty("fga")
    private Integer fga;
    @JsonProperty("fgm")
    private Integer fgm;
    @JsonProperty("ft_pct")
    private Double ftPct;
    @JsonProperty("fta")
    private Integer fta;
    @JsonProperty("ftm")
    private Integer ftm;
    @JsonProperty("game")
    private Game game;
    @JsonProperty("min")
    private String min;
    @JsonProperty("oreb")
    private Integer oreb;
    @JsonProperty("pf")
    private Integer pf;
    @JsonProperty("player")
    private Player player;
    @JsonProperty("pts")
    private Integer pts;
    @JsonProperty("reb")
    private Integer reb;
    @JsonProperty("stl")
    private Integer stl;
    @JsonProperty("team")
    private Team team;
    @JsonProperty("turnover")
    private Integer turnover;
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

    @JsonProperty("ast")
    public Integer getAst() {
        return ast;
    }

    @JsonProperty("ast")
    public void setAst(Integer ast) {
        this.ast = ast;
    }

    @JsonProperty("blk")
    public Integer getBlk() {
        return blk;
    }

    @JsonProperty("blk")
    public void setBlk(Integer blk) {
        this.blk = blk;
    }

    @JsonProperty("dreb")
    public Integer getDreb() {
        return dreb;
    }

    @JsonProperty("dreb")
    public void setDreb(Integer dreb) {
        this.dreb = dreb;
    }

    @JsonProperty("fg3_pct")
    public Double getFg3Pct() {
        return fg3Pct;
    }

    @JsonProperty("fg3_pct")
    public void setFg3Pct(Double fg3Pct) {
        this.fg3Pct = fg3Pct;
    }

    @JsonProperty("fg3a")
    public Integer getFg3a() {
        return fg3a;
    }

    @JsonProperty("fg3a")
    public void setFg3a(Integer fg3a) {
        this.fg3a = fg3a;
    }

    @JsonProperty("fg3m")
    public Integer getFg3m() {
        return fg3m;
    }

    @JsonProperty("fg3m")
    public void setFg3m(Integer fg3m) {
        this.fg3m = fg3m;
    }

    @JsonProperty("fg_pct")
    public Double getFgPct() {
        return fgPct;
    }

    @JsonProperty("fg_pct")
    public void setFgPct(Double fgPct) {
        this.fgPct = fgPct;
    }

    @JsonProperty("fga")
    public Integer getFga() {
        return fga;
    }

    @JsonProperty("fga")
    public void setFga(Integer fga) {
        this.fga = fga;
    }

    @JsonProperty("fgm")
    public Integer getFgm() {
        return fgm;
    }

    @JsonProperty("fgm")
    public void setFgm(Integer fgm) {
        this.fgm = fgm;
    }

    @JsonProperty("ft_pct")
    public Double getFtPct() {
        return ftPct;
    }

    @JsonProperty("ft_pct")
    public void setFtPct(Double ftPct) {
        this.ftPct = ftPct;
    }

    @JsonProperty("fta")
    public Integer getFta() {
        return fta;
    }

    @JsonProperty("fta")
    public void setFta(Integer fta) {
        this.fta = fta;
    }

    @JsonProperty("ftm")
    public Integer getFtm() {
        return ftm;
    }

    @JsonProperty("ftm")
    public void setFtm(Integer ftm) {
        this.ftm = ftm;
    }

    @JsonProperty("game")
    public Game getGame() {
        return game;
    }

    @JsonProperty("game")
    public void setGame(Game game) {
        this.game = game;
    }

    @JsonProperty("min")
    public String getMin() {
        return min;
    }

    @JsonProperty("min")
    public void setMin(String min) {
        this.min = min;
    }

    @JsonProperty("oreb")
    public Integer getOreb() {
        return oreb;
    }

    @JsonProperty("oreb")
    public void setOreb(Integer oreb) {
        this.oreb = oreb;
    }

    @JsonProperty("pf")
    public Integer getPf() {
        return pf;
    }

    @JsonProperty("pf")
    public void setPf(Integer pf) {
        this.pf = pf;
    }

    @JsonProperty("player")
    public Player getPlayer() {
        return player;
    }

    @JsonProperty("player")
    public void setPlayer(Player player) {
        this.player = player;
    }

    @JsonProperty("pts")
    public Integer getPts() {
        return pts;
    }

    @JsonProperty("pts")
    public void setPts(Integer pts) {
        this.pts = pts;
    }

    @JsonProperty("reb")
    public Integer getReb() {
        return reb;
    }

    @JsonProperty("reb")
    public void setReb(Integer reb) {
        this.reb = reb;
    }

    @JsonProperty("stl")
    public Integer getStl() {
        return stl;
    }

    @JsonProperty("stl")
    public void setStl(Integer stl) {
        this.stl = stl;
    }

    @JsonProperty("team")
    public Team getTeam() {
        return team;
    }

    @JsonProperty("team")
    public void setTeam(Team team) {
        this.team = team;
    }

    @JsonProperty("turnover")
    public Integer getTurnover() {
        return turnover;
    }

    @JsonProperty("turnover")
    public void setTurnover(Integer turnover) {
        this.turnover = turnover;
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
