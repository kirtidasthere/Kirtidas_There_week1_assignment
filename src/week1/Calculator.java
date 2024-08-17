package week1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the First number:");
        int a=sc.nextInt();
        System.out.println("Enter the second number:");
        int b= sc.nextInt();

        System.out.println("Enter 1 for addition \nEnter 2 for subtraction \nEnter 3 for multiplication \nEnter 4 For division");
        int choice=sc.nextInt();

        switch (choice)
        {
            case 1:
                System.out.println("Sum: "+(a+b));
                break;

            case 2:
                System.out.println("Difference: "+(a-b));
                break;

            case 3:
                System.out.println("Product: "+(a*b));
                break;

            case 4:
                if(a !=0) {
                    System.out.println("Quotient: " + (a/b));
                }
                else {
                    System.out.println("invalid option selected. Division by zero is not allowed.");
                }

        }
    }
}
