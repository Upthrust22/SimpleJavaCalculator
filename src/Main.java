// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static double calculator(double a, char operator, double b) {
        double result = 0;
        if (operator == '+') {
            result = a + b;
        } else if (operator == '-') {
            result = a - b;
        } else if (operator == '*') {
            result = a * b;
        } else if (operator == '/') {
            result = a / b;
        } else if (operator == '%') {
            result = a % b;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(calculator(5, '+', 6));
        System.out.println(calculator(10, '-', 3));
        System.out.println(calculator(120, '*', 7));
        System.out.println(calculator(300, '/', 15));
        System.out.println(calculator(525, '%', 98));
    }
}