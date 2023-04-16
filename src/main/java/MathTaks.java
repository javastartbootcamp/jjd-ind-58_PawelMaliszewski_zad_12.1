public class MathTaks {
    private double a;
    private char operator;
    private double b;

    public MathTaks(double a, char operator, double b) {
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
        return a + " " + operator + " " + b + " = ";
    }
}
