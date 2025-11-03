import java.util.Scanner;

public class GCDFor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number1, number2;

        System.out.println("Enter first number:");
        number1 = s.nextInt();

        System.out.println("Enter second number:");
        number2 = s.nextInt();

        int gcd = 1;
        for (int i = 1; i <= number1 && i <= number2; i++) {
            if (number1 % i == 0 && number2 % i == 0) {
                gcd = i;
            }
        }

        System.out.println("GCD = " + gcd);
        s.close();
    }
}

