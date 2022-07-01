package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int i = 0;
        int curr = 1;
        while (i <= printToInclusive){
            if (i <= 1)
                System.out.println(1);
            else{
                curr *= i;
                System.out.println(curr);
            }

            i++;
        }

    }
}
