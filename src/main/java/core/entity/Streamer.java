package core.entity;

import javafx.util.Pair;

import java.util.List;

public class Streamer {
    /** Имя стримера */
    private final String name;
    /** Время когда он стримит */
    private final List<Pair<Integer, Integer>> uptime;
    /** Любимые игры */
    private final List<Game> favoriteGames;
    /** Харизма */
    private final Float charisma;

    public Streamer(String name, List<Pair<Integer, Integer>> uptime, List<Game> favoriteGames, Float charisma) {
        this.name = name;
        this.uptime = uptime;
        this.favoriteGames = favoriteGames;
        this.charisma = charisma;
    }

    public String getName() {
        return name;
    }

    public List<Pair<Integer, Integer>> getUptime() {
        return uptime;
    }

    public List<Game> getFavoriteGames() {
        return favoriteGames;
    }

    public Float getCharisma() {
        return charisma;
    }
}
