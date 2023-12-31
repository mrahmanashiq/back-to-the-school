import java.util.*;
import java.lang.*;

// The main method must be in a class named "Main"
class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isArmStrongNumber(n));
    }

    public static boolean isArmStrongNumber(int n) {
        int lenOfDigit = countOfDigit(n);
        int sum = 0;
        int givenNumber = n;
        while (n > 0) {
            int rem = n % 10;
            sum += (int) Math.pow(rem, lenOfDigit);
            n = n / 10;
        }
        return sum == givenNumber;
    }

    public static int countOfDigit(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n = n/10;
        }
        return count;
    }
}
