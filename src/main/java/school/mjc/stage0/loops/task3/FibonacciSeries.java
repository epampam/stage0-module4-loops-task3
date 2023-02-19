package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int numTerms) {
        int previousTerm = 0;
        int currentTerm = 1;
        for (int i = 0; i < numTerms; i++) {
            System.out.println(previousTerm);
            int nextTerm = previousTerm + currentTerm;
            previousTerm = currentTerm;
            currentTerm = nextTerm;
        }
    }
}
