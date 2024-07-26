import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of income: ");
        double income = sc.nextDouble();

        double tax = calculateTax(income);
        System.out.printf("The tax amount for an income of EUR %.2f is EUR %.2f.%n",income, tax);
    }

    public static double calculateTax(double income) {
        double tax = 0.0;

        if (income <= 10000) {
            tax = income*0.025;
        } else if (income <= 25000) {
            tax = income*0.043;
        } else {
            tax = income*0.067;
        }
        return tax;
    }
}