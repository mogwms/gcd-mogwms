/*
 * Program Name: Scan2.java
 * Author(s): Malcolm Williams, Ethan Vaughn 
 * Date: 11/4/2025
 * Course: Computer Science I
 * Instructor: Suraj Maraboina
 *
 * Description:
 * -------------------------------------------------------------
 * This program demonstrates the use of a flag-controlled 
 * while loop to search for the Greatest Common Divisor (GCD)
 * of two numbers using the Euclidian Method. The user is
 * prompted to enter two numbers (Number A and B), and
 * then the GCD is calculated.
 * 
 * If the numbers have a GCD, an integer will be outputted.
 * 
 * 
 * The loop uses a comparision flag by checking if Number A is not equal to zero. It is used to control its
 * termination, ensuring that the loop stops after the GCD is found and Number A is equal to zero.
 * -------------------------------------------------------------
 */

import java.util.Scanner;

public class GCDWhile {
    // Step 1: Create Scanner object for input
    public static Scanner input = new Scanner(System.in);
    // Step 2: Declare function calculateGCD for GCD calculation
    public static int calculateGCD(int a, int b) {
        // Step 6: Begin flag-controlled while loop
        // The loop while execute until a is equal to zero
        while (a != 0) {
           // Step 7: Create temporary variable to hold original value of variable a
           int temp = a;
           // Step 8: Set variable a to the remainder of b and a
           a = b % a;
           // Step 9: Set variable b to the original value of variable a
           b = temp;
        }
        // Step 10: Return value of variable b
        return b;
    }
    
    public static void main(String[] args) {
        // Step 3: Declare int variables a and b
        int a;
        int b;
        // Step 4: Prompt input for int variables a and b
        System.out.println("Enter A");
        a = input.nextInt();
        System.out.println("Enter B");
        b = input.nextInt();
        // Step 5: Call and Output the return value of calculateGCD
        System.out.println("   ");
        System.out.println("The GCD is: " + calculateGCD(a, b));
        input.close();
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
 *    42, 56
 * Output:
 *    The GCD is: 14
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