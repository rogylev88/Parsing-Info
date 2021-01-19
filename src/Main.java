import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {
 String htmlfile = parseFile("data/code.html");

 Document doc = Jsoup.parse(htmlfile);
 Elements elements = doc.select("h3");
 elements.forEach(System.out ::println);

        
    }
    public static String parseFile(String path){
        StringBuilder builder = new StringBuilder();
        try
        {
            List<String> lines = Files.readAllLines(Paths.get(path));
            lines.forEach(line -> builder.append(line + "/n"));
        }
     catch (Exception ex){
            ex.printStackTrace();
     }


        return builder.toString();
    }
}

