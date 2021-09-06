import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Csv {

    public static List<Game> readCSV(Path csvFilePath){
        List<Game> list = new ArrayList<>();
        try {
            Reader reader = Files.newBufferedReader(csvFilePath);
            CsvToBean<Game> csvToBean = new CsvToBeanBuilder(reader)
                    .withType(Game.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
            list = csvToBean.parse();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
