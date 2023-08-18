import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = Integer.parseInt(s.nextLine());
        int b = Integer.parseInt(s.nextLine());
        int c = s.nextInt();

        if (a > b) {
            System.out.println(a > c ? a : c);
        } else if (b > c) {
            System.out.println(Math.max(b, a));
        } else {
            System.out.println(c);
        }
    }
}