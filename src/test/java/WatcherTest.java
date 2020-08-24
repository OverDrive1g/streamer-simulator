import core.entity.Game;
import core.entity.Streamer;
import core.entity.Watcher;
import javafx.util.Pair;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class WatcherTest {

    @Test
    public void getChanceToWatch(){
        List<Pair<Integer,Integer>> watcherUptime= new ArrayList<Pair<Integer, Integer>>();
        watcherUptime.add(new Pair<Integer, Integer>(1,2));
        watcherUptime.add(new Pair<Integer, Integer>(3,5));
        List<Game> watcherFavoriteGames = new ArrayList<Game>();
        watcherFavoriteGames.add(new Game("mario"));
        watcherFavoriteGames.add(new Game("cs1.6"));
        Watcher watcher = new Watcher("Test name", watcherUptime, watcherFavoriteGames);

        List<Pair<Integer,Integer>> streamerUptime= new ArrayList<Pair<Integer, Integer>>();
        streamerUptime.add(new Pair<Integer, Integer>(1,2));
        streamerUptime.add(new Pair<Integer, Integer>(3,5));
        List<Game> streamerFavoriteGames = new ArrayList<Game>();
        streamerFavoriteGames.add(new Game("mario"));
        streamerFavoriteGames.add(new Game("cs1.6"));
        Streamer streamer = new Streamer("name", streamerUptime,streamerFavoriteGames,0.9f);

        Float chanceToWatch = watcher.getChanceToWatch(streamer);
        assertEquals(chanceToWatch, new Float(1.0530001f));
    }

    @Test
    public void getChanceToFollow(){
        List<Pair<Integer,Integer>> watcherUptime= new ArrayList<Pair<Integer, Integer>>();
        watcherUptime.add(new Pair<Integer, Integer>(1,2));
        watcherUptime.add(new Pair<Integer, Integer>(3,5));
        List<Game> watcherFavoriteGames = new ArrayList<Game>();
        watcherFavoriteGames.add(new Game("mario"));
        watcherFavoriteGames.add(new Game("cs1.6"));
        Watcher watcher = new Watcher("Test name", watcherUptime, watcherFavoriteGames);

        List<Pair<Integer,Integer>> streamerUptime= new ArrayList<Pair<Integer, Integer>>();
        streamerUptime.add(new Pair<Integer, Integer>(1,2));
        streamerUptime.add(new Pair<Integer, Integer>(3,5));
        List<Game> streamerFavoriteGames = new ArrayList<Game>();
        streamerFavoriteGames.add(new Game("mario"));
        streamerFavoriteGames.add(new Game("cs1.6"));
        Streamer streamer = new Streamer("name", streamerUptime,streamerFavoriteGames,0.9f);

        Float chanceToFollow = watcher.getChanceToFollow(streamer);
        assertEquals(chanceToFollow, new Float(0.9477001f));
    }
}
