package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int n1 = 0;
        int n2 = 1;
        int nextNum = n1 + n2;
        System.out.println(n1);
        System.out.println(n2);
        for (int i = 1; i <= lastFibonacci; ++i) {
            nextNum = n1 + n2;
            System.out.println(nextNum);
            n1 = n2;
            n2 = nextNum;
        }
    }
}
