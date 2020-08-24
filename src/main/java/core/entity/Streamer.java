package core.entity;

import javafx.util.Pair;

import java.util.ArrayList;
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
    /** Массив зрителей */
    private final List<Watcher> watchers;

    /** Массив подписчиков */
    private final List<Watcher> followers;

    public Streamer(String name, List<Pair<Integer, Integer>> uptime, List<Game> favoriteGames, Float charisma) {
        this.name = name;
        this.uptime = uptime;
        this.favoriteGames = favoriteGames;
        this.charisma = charisma;
        this.watchers = new ArrayList<>();
        this.followers = new ArrayList<>();
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

    public boolean addNewWatcher(Watcher watcher){
        Float chanceToWatch = watcher.getChanceToWatch(this);

        if(chanceToWatch > 0.7){
            this.watchers.add(watcher);
            return true;
        }

        return false;
    }
}
