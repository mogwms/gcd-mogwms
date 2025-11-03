import java.util.Scanner;

public class GCDDoWhile {
    public static Scanner input = new Scanner(System.in);
    public static int calculateGCD(int a, int b) {
        do {
           int temp = a;
           a = b % a;
           b = temp;
        } while (a != 0);
        return b;
    }

    public static void main(String[] args) {
        int a;
        int b;

        System.out.println("Enter A");
        a = input.nextInt();
        System.out.println("Enter B");
        b = input.nextInt();

        System.out.println("   ");
        System.out.println("The GCD is: " + calculateGCD(a, b));
    }
}