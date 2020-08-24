import com.sun.javaws.IconUtil;
import core.entity.Game;
import core.entity.Streamer;
import core.entity.Watcher;
import core.usecase.WatcherFactory;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        WatcherFactory watcherFactory = new WatcherFactory();
        List<Pair<Integer,Integer>> uptime= new ArrayList<Pair<Integer, Integer>>();
        uptime.add(new Pair<Integer, Integer>(1,2));
        uptime.add(new Pair<Integer, Integer>(3,5));
        List<Game> favoriteGames = new ArrayList<Game>();
        favoriteGames.add(new Game("mario"));
        favoriteGames.add(new Game("cs1.6"));
        Streamer me = new Streamer("Me", uptime,favoriteGames,0.5f);

        for (int i = 0; i < 20; i++) {
            Watcher newWatcher = watcherFactory.generateWatcher();
            boolean isAdded = me.addNewWatcher(newWatcher);
            if(isAdded) System.out.println("You have new watcher");
        }

        //out print statistic
    }
}
