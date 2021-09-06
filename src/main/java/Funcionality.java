import java.util.ArrayList;
import java.util.List;

public class Funcionality {

    public static List<Game> getListByPlatform(List<Game> games, String platform){
        List<Game> gamesByPlatform = new ArrayList<>();

        games.stream().filter((game -> game.getPlatform().equals(platform))).forEach(game -> gamesByPlatform.add(game));

        return gamesByPlatform;
    }

    public static List<Game> getByPuBlisher(List<Game> games ,
                                            String publisher){
        List<Game> gamesByPublisher = new ArrayList<>();

        games.stream().filter((game -> game.getPublisher().equals(publisher))).forEach(game -> gamesByPublisher.add(game));

        return gamesByPublisher;
    }
}
