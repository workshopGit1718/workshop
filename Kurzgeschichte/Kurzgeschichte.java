import java.nio.file.*;
import java.util.*;

public class Kurzgeschichte
{

    public static void main(String[] args) throws Exception {
        ArrayList<String> textDateien = new ArrayList();

        for(int i = 1; i <= 9; i++) {
            textDateien.add("teil_0" + i + ".txt");
        }
        for(int i = 10; i <= 12; i++) {
            textDateien.add("teil_" + i + ".txt");
        }
        
        for(String datei : textDateien) {
            String dateiinhalt = new String(Files.readAllBytes(Paths.get(datei)));;
            System.out.println(dateiinhalt);
        }

    }

}
