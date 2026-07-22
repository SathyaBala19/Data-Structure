package Java.Numbers;

import java.util.*;

public class HexToDeci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String hex = sc.next().toUpperCase();

        int decimal = 0;
        int power = 0;

        for(int i = hex.length() - 1; i >= 0; i--) {
            char ch = hex.charAt(i);
            int value;

            if (ch >= '0' && ch <= '9')
                value = ch - '0';
            else
                value = ch - 'A' + 10;

            decimal += value * (int)Math.pow(16,power);
            power++;
        }
        System.out.println("Decimal = " + decimal);
        sc.close();
    }
}
