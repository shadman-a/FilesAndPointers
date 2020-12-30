import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Main {
    public static void main(String[] args) {
        try {
            Files.write(
                    Paths.get("/Users/shadman/orderevents.txt"),
                    "this is a thing\n".getBytes(),
                    StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
