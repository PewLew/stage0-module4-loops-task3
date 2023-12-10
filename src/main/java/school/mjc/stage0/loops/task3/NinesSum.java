package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int n = 9;
        int sum = 0;
        String s = Integer.toString(lengthOfLastNumber);
        for(int i = 0; i<s.length(); i++){
            sum += n;
            n = n * 10 + 9;
        }
        System.out.println(sum);
    }
}
