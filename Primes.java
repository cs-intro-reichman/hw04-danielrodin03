public class Primes {
    public static void main(String[] args) {
        for (int i = 0; i < Integer.parseInt(args [0]); i++) {
            if (isPrime(i)) System.out.println(i);
        }
    }
    public static boolean isPrime(int i) {
        if (i <= 1) return false;
        if (i == 2 || i == 3) return true;
        for (int j = 2; j*j <= i; j++) {
            if (i % j == 0) return false;
        }
        return true;
    }
}