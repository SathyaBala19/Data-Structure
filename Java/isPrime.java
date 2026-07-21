package Java;

public class isPrime {
    public static void main(String[] args) {
        int n = 50;
        boolean[] arr = new boolean[n + 1];

        for (int i = 2; i <= n; i++) {
            arr[i] = true; // Assume prime

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    arr[i] = false;
                    break;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            System.out.println(i + " : " + arr[i]);
        }
    }
}