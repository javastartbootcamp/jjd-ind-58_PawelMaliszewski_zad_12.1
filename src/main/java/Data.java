import java.io.*;
import java.util.Scanner;

public class Data {

    static MathTaks[] readFile(String fileName) throws IOException {
        int lines = countLines(fileName);
        MathTaks[] mathTaks = new MathTaks[lines];
        var fileReader = new BufferedReader(new FileReader(fileName));
        for (int i = 0; i < mathTaks.length; i++) {
            mathTaks[i] = getMathTaskData(fileReader.readLine());
        }
        return mathTaks;
    }

    private static MathTaks getMathTaskData(String text)  {
        String[] split = text.split(" ");
        try {
            return new MathTaks(Double.parseDouble(split[0]), split[1].charAt(0), Double.parseDouble(split[2]));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("niepoprawny format danych w pliku");
        }
        return null;
    }

    private static int countLines(String fileName) throws FileNotFoundException {
        int lines = 0;
        Scanner sc = new Scanner(new File(fileName));
        while (sc.hasNextLine()) {
            sc.nextLine();
            lines++;
        }
        return lines;
    }

    static void printEquation(MathTaks mathTaks) {
        System.out.println(mathTaks + String.valueOf(MathCalc.solveTheEquation(mathTaks)));
    }
}
