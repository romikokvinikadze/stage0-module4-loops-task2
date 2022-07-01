package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int i = 0;

        while(i <= printToInclusive){
            if (checkIfPrime(i)){
                System.out.println(i);
            }
            i++;
        }
    }

    public static boolean checkIfPrime(int num){
        if (num < 2) return false;
        if (num == 2) return true;
        for (int i=2; i<=Math.sqrt(num); i++){
            if (num % i == 0) return false;
        }

        return true;
    }

}
