/*
 * Program Name: Scan2.java
 * Author(s): Malcolm Williams, Ethan Vaughn 
 * Date: 11/4/2025
 * Course: Computer Science I
 * Instructor: Suraj Maraboina
 *
 * Description:
 * -------------------------------------------------------------
 * This program demonstrates the use of a for loop that iterates
 * to search for the Greatest Common Divisor (GCD)
 * of two numbers using the Euclidian Method. The user is
 * prompted to enter two numbers (Number A and B), and
 * then the GCD is calculated.
 * 
 * If the numbers have a GCD, an integer will be outputted.
 * 
 * The loop checks if the remainder of Number 1 is equal to zero 
 * and if the remainder of Number 2 is equal to zero, and then 
 * sets the GCD to i.
 * -------------------------------------------------------------
 */
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

/*
 * -------------------------------------------------------------
 *                 TEST CASES & OUTPUT VERIFICATION
 * -------------------------------------------------------------
 *
 * TEST CASE 1 – ITEM FOUND
 * Input:
 *    11, 121
 * Output:
 *    The GCD is: 11
 *
 * TEST CASE 2 – ITEM FOUND
 * Input:
 *    12, 36
 * Output:
 *    The GCD is: 12
 * 
 * TEST CASE 3 – ITEM FOUND
 * Input:
 *    4, 2
 * Output:
 *    The GCD is: 2
 * 
 * TEST CASE 4 – ITEM FOUND
 * Input:
 *    13, 3
 * Output:
 *    The GCD is: 1
 * 
 * TEST CASE 5 – ITEM FOUND
 * Input:
 *    1984, 17
 * Output:
 *    The GCD is: 1
 * 
 * TEST CASE 6 – ITEM FOUND
 * Input:
 *    216, 1024
 * Output:
 *    The GCD is: 8
 * -------------------------------------------------------------
 * END OF FILE
 * -------------------------------------------------------------
 */
