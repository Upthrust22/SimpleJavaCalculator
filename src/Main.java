// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static void calculator(double a, String operator, double b) {
        if(operator.equals("+")) {
            System.out.println(a + b);
        } else if (operator.equals("-")) {
            System.out.println(a - b);
        } else if (operator.equals("*")) {
            System.out.println(a * b);
        } else if (operator.equals("/")) {
            System.out.println(a / b);
        } else if (operator.equals("%")) {
            System.out.println(a % b);
        } else {
            System.out.println("enter correct operator");
        }
    }
    public static void main(String[] args) {
        calculator(5, "+", 6);
        calculator(10, "-", 6);
        calculator(120, "*", 6);
        calculator(300, "/", 6);
        calculator(525, "%", 6);
    }
}