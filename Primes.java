public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args [0]);
        int count = 0;
        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 0; i <= n; i++) {
            if (isPrime(i)) {
            System.out.print(i + " ");
            count++;
            }
        }
        System.err.println();
        System.err.println("There are " + count + " primes between 2 and " + n);
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