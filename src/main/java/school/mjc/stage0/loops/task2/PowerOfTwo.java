package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
         int count=0;
     while(count<=power)
     {
         System.out.println(Math.pow(2,count));
         ++count;
     }

    }
}
