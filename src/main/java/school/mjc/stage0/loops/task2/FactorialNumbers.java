package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
         int count=1;
        int f=1;
        while(count<=printToInclusive)
        {
            System.out.println(f=f*count);
            count++;
        }

    }
}
