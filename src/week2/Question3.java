package week2;

class Calculator {
    double num1, num2;
    public Calculator() {
        num1 = 0;
        num2 = 0;
    }

    public Calculator(double num1) {
        this.num1 = num1;
        this.num2 = 0;
    }

    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add() {
        return num1 + num2;
    }


    public double add(double num3) {
        return num1 + num2 + num3;
    }
}

public class Question3 {
    public static void main(String[] args) {

        Calculator calc1 = new Calculator();
        System.out.println("Sum (default constructor): " + calc1.add());


        Calculator calc2 = new Calculator(10);
        System.out.println("Sum (one parameter): " + calc2.add());

        Calculator calc3 = new Calculator(10, 20);
        System.out.println("Sum (two parameters): " + calc3.add());

        System.out.println("Sum (method overloading with three parameters): " + calc3.add(30));
    }
}
