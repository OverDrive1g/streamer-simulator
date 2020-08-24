package core.usecase;

import core.entity.Game;
import core.entity.Watcher;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class WatcherFactory {

    public Watcher generateWatcher(){
        String name = this.generateName();
        List<Pair<Integer, Integer>> favoriteUptime = this.generateFavoriteUptime();
        List<Game> favoriteGames = this.generateFavoriteGames();

        return new Watcher(name, favoriteUptime, favoriteGames);
    }

    private List<Game> generateFavoriteGames(){
        return new ArrayList<>();
    }

    private List<Pair<Integer, Integer>> generateFavoriteUptime(){
        return new ArrayList<Pair<Integer, Integer>>();
    }

    private String generateName(){
        return "User name";
    }
}
