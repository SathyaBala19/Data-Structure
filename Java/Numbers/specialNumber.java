package Java.Numbers;

import java.util.Scanner;

public class specialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int number = sc.nextInt();

        if (number >= 10 && number <= 99) {
            int first_digi = number / 10;
            int last_digi = number % 10;

            int digiSum = first_digi + last_digi;
            int digiProduct = first_digi * last_digi;

            int result = digiProduct + digiSum;

            if (result == number) {
                System.out.println(number + " is a Special number.");
            } else {
                System.out.println(number + " is not a special number");
            }
        } else {
            System.out.println("Please enter two digi number");
        }
        sc.close();
    }
}
