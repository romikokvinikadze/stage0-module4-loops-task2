package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int i = 0;
        int to = Math.abs(multiplyByAndToInclusive);

        if (to != 0) {
            while (i <= to) {
                System.out.println(i * multiplyByAndToInclusive);
                i++;
            }
        }
    }
}
