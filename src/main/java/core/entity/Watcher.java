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

    /**
     * Метод для расчета вероятности того что данный юзер начнет смотреть стримера
     * @param streamer
     * @return
     */
    public Float getChanceToWatch(Streamer streamer){
        Float baseChance = 0.6f;
        for (Pair<Integer, Integer> uptimeSession:this.uptime){
            if(streamer.getUptime().contains(uptimeSession)){
                baseChance += 0.05f;
            }
        }

        for (Game game:this.favoriteGames) {
            if(streamer.getFavoriteGames().contains(game)){
                baseChance += 0.04f;
            }
        }

        return baseChance;
    }

    /**
     * Метод для расчета вероятности того что данный юзер подпишется на стримера стримера
     * @param streamer
     * @return
     */
    public Float getChanceToFollow(Streamer streamer){
        return this.getChanceToWatch(streamer) *0.9f;
    }
}
