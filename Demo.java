import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.List;

public class Demo {
    public static void main(String[] args){
        Path filePath = Paths.get("demoFile.txt"); 
        List<String> lines = Files.readAllLines(filePath);
                
        for (String line : lines) {
            System.out.println(line);
        }
    }
}

