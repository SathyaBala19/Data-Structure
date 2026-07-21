package Java.Numbers;

import java.util.Scanner;

public class armstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int original = number;
        int temp = number;
        int digits = 0;
        int total = 0;

        // Count the number of digits
        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        temp = number;

        // Calculate Armstrong sum
        while (temp > 0) {
            int digit = temp % 10;

            total += (int) Math.pow(digit, digits);

            temp /= 10;
        }

        if (total == original) {
            System.out.println(number + " is an Armstrong Number");
        } else {
            System.out.println(number + " is not an Armstrong Number");
        }

        sc.close();
    }
}