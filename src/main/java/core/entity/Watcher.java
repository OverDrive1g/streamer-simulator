package core.entity;

import javafx.util.Pair;

import java.util.List;

public class Watcher {
    /** Имя зрителя */
    private final String name;
    /** Время когда он любит смотреть стримы */
    private final List<Pair<Integer, Integer>> uptime;
    /** Любимые игры */
    private final List<Game> favoriteGames;

    public Watcher(String name, List<Pair<Integer, Integer>> uptime, List<Game> favoriteGames) {
        this.name = name;
        this.uptime = uptime;
        this.favoriteGames = favoriteGames;
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
}
