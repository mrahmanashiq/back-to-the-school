import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main"
class Main {
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
            sum += Math.pow(rem, lenOfDigit);
            n = n / 10;
        }
        if (sum == givenNumber) {
            return true;
        } else {
            return false;
        }
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
