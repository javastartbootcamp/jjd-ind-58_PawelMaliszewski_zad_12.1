import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException {

        String fileName = "src\\main\\operations.txt";

        MathTask[] mathTask = FileReader.readFile(fileName);
        for (MathTask task : mathTask) {
            System.out.println(task + " = " + task.solveTheEquation());
        }
    }
}