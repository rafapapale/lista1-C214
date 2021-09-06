import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Testes {

    private static List<Game> gameList;
    
    @BeforeClass
    public static void initClass() throws URISyntaxException {
        Path caminho = Paths.get(ClassLoader.getSystemResource("vendas-games.csv").toURI());
        gameList = Csv.readCSV(caminho);
    }

    @Test
    public void testeGamesPS4(){
        List<Game> ps4Games = Funcionality.getListByPlatform(gameList, "PS4");

        Assert.assertEquals(5,ps4Games.size());
    }

    @Test
    public void testeGameX360(){
        List<Game> x360Games = Funcionality.getListByPlatform(gameList, "X360");

        Assert.assertEquals(16,x360Games.size());
    }

    @Test
    public void testeNintendo(){
        List<Game> nintendo = Funcionality.getByPuBlisher(gameList, "Nintendo");

        Assert.assertEquals(52,nintendo.size());
    }

    @Test
    public void testeMicrosoft(){
        List<Game> microsoft = Funcionality.getByPuBlisher(gameList, "Microsoft Game Studios");

        Assert.assertEquals(6,microsoft.size());
    }

    @Test
    public void testNumberOfLines(){
        int numLines = gameList.size();
        Assert.assertEquals(100,numLines);
    }
}
