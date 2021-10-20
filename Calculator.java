public class Calculator {

    public Calculator() {

    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public int modulo(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        int addition = myCalculator.add(5, 7);
        int subtract = myCalculator.subtract(45, 11);
        int multiply = myCalculator.multiply(45, 11);
        int divide = myCalculator.divide(45, 11);
        int modulo = myCalculator.modulo(45, 11);
        System.out.println(addition);
        System.out.println(subtract);

    }
}