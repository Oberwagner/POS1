public class EratosthenesPrimeSieve implements PrimeSieve {
    private int p;
    private int upperBound;

    public EratosthenesPrimeSieve(int p, int upperBound) {
        this.p = p;
        this.upperBound = upperBound;
    }

    public EratosthenesPrimeSieve(){}

    @Override
    public boolean isPrime(int p) {
        if (p <= 1) {
            return false;
        }
        if (p <= 3) {
            return true;
        }
        if (p % 2 == 0 || p % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= p; i += 6) {
            if (p % i == 0 || p % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void printPrime(int upperBound) {
        System.out.println("Primzahlen bis " + upperBound + ":");
        for (int i = 2; i <= upperBound; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
