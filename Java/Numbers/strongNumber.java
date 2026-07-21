package Java.Numbers;

import java.util.*;

public class strongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int number = sc.nextInt();

        int temp = number;
        int total = 0;

        while (temp > 0) {
            int digit = temp % 10;
            int fact = 1;

            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }

            total += fact;
            temp /= 10;
        }

        if (total == number) {
            System.out.println(number + " is a Strong number");
        } else {
            System.out.println(number + " is not a strong number");
        }
        sc.close();
    }
    
}
