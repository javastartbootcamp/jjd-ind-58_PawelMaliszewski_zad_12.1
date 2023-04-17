import java.io.*;
import java.util.Scanner;

public class FileReader {

    static MathTask[] readFile(String fileName) throws IOException {
        int lines = countLines(fileName);
        MathTask[] mathTaks = new MathTask[lines];
        try (var fileReader = new BufferedReader(new java.io.FileReader(fileName))) {
            for (int i = 0; i < mathTaks.length; i++) {
                mathTaks[i] = getMathTaskData(fileReader.readLine());
            }
        }
        return mathTaks;
    }

    private static MathTask getMathTaskData(String text) {
        String[] split = text.split(" ");
        return new MathTask(Double.parseDouble(split[0]), split[1].charAt(0), Double.parseDouble(split[2]));
    }

    private static int countLines(String fileName) throws FileNotFoundException {
        int lines = 0;
        try (Scanner sc = new Scanner(new File(fileName))) {
            while (sc.hasNextLine()) {
                sc.nextLine();
                lines++;
            }
            return lines;
        }
    }
}
