public class Main {
    public static void main(String[] args) {
        int p = 1;
        int upperBound = 50;

        EratosthenesPrimeSieve eratosthenesPrimeSieve = new EratosthenesPrimeSieve();

        if (eratosthenesPrimeSieve.isPrime(p)) {
            System.out.println(p + " ist eine Primzahl.");
        } else {
            System.out.println(p + " ist keine Primzahl.");
        }

        eratosthenesPrimeSieve.printPrime(upperBound);
    }
}
