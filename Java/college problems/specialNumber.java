
public class specialNumber {
    public static void main(String[] args) {
        int s = 10;
        while (s <= 45) {
            int a = s % 10;
            int b = s / 10;

            int multi = a * b;
            int sum = a + b;

            if (s == (multi + sum)) {
                System.out.println(s);
            }
            
            s += 1;
        }
    }
    
}
