public class For_loop {
    public static void main(String[] args) {
        For_loop obj = new For_loop();
        System.out.println(obj.isPrime(5));

    }

    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
