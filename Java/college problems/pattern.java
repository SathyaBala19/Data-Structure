public class pattern {
    public static void patternn(int n) {
        int y = n-1;
        while (y >= 0) {
            int i = 0;
            while (i < y) {
                System.out.print(" ");
                i++;
            }
            int k = 0;
            while (k + y < n) {
                if ((k%y) != 0) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
                k++;
            }
            System.out.println();
            y--;
        }
    }

    public static void main(String[] args) {
        int n = 16;
        patternn(n);
    }
}