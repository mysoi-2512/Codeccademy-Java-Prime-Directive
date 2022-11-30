import java.util.ArrayList;

public class PrimeDirective {

    //Check Prime
    public static boolean isPrime(int number) {
        boolean isPrime = true;
        if (number == 2) {
            isPrime = true;
        } else if (number < 2) {
            isPrime = false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    // Create ArrayList
    public static ArrayList<Integer> onlyPrimes(int[] numbers) {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        for (int number: numbers) {
            if (isPrime(number) == true) {
                primes.add(number);
            }
        }
        return primes;
    }

    //Main
    public static void main(String[] args) {

        PrimeDirective pd = new PrimeDirective();
        int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
        System.out.println(pd.onlyPrimes(numbers));
    }

}

