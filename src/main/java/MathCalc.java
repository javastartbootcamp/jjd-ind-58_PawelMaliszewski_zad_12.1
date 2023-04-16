public class MathCalc {
    private static final char ADD = '+';
    private static final char MINUS = '-';
    private static final char MULTIPLY = '*';
    private static final char DIVIDE = '/';

    static double solveTheEquation(MathTaks mathTaks) {
        try {
            switch (mathTaks.getOperator()) {
                case ADD -> {
                    return mathTaks.getA() + mathTaks.getB();
                }
                case MINUS -> {
                    return mathTaks.getA() - mathTaks.getB();
                }
                case MULTIPLY -> {
                    return mathTaks.getA() * mathTaks.getB();
                }
                case DIVIDE -> {
                    return mathTaks.getA() / mathTaks.getB();
                }
                default -> {
                    return 0;
                }
            }
        } catch (NullPointerException e) {
            System.err.println("Nie rozpoznano operatora");
        }
        return 0;
    }
}
