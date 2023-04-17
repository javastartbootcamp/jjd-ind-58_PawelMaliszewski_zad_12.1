public class MathTask {

    private static final char ADD = '+';
    private static final char MINUS = '-';
    private static final char MULTIPLY = '*';
    private static final char DIVIDE = '/';
    private double a;
    private char operator;
    private double b;

    public MathTask(double a, char operator, double b) {
        this.a = a;
        this.operator = operator;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return a + " " + operator + " " + b;
    }

    public double solveTheEquation() {
        return switch (operator) {
            case ADD -> a + b;
            case MINUS -> a - b;
            case MULTIPLY -> a * b;
            case DIVIDE -> a / b;
            default -> 0;
        };
    }
}
