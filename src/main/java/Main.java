import java.io.FileNotFoundException;
import java.io.IOException;

class Main {
    public static void main(String[] args) {

        String fileName =  "C:\\Users\\Pawel\\IdeaProjects\\jjd-ind-58_PawelMaliszewski_zad_12.1\\src\\main\\operations.txt";

        try {
            MathTaks[] mathTaks = Data.readFile(fileName);
            for (MathTaks task : mathTaks) {
                Data.printEquation(task);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}