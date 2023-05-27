import java.math.BigInteger;
import java.util.Arrays;

public class FibonacciUsingMemory {
    public static void main(String[] args) {

        long[] array = new long[100];

        for(int i = 0; i < 100; i++){
            array[i] = 0;
        }

        System.out.println("fibonacciwithmemory(array, 99) = " + fibonacciwithmemory(array, 6));
    }

    public static long fibonacciwithmemory(long[] array, int n){
        System.out.println("called f(" + n + ")");
        if(n == 1 || n == 2){
            return 1;
        } else if(array[n] != 0){
            return array[n];
        } else {
            array[n] = fibonacciwithmemory(array, (n - 1)) + fibonacciwithmemory(array, (n - 2));
        }
        
        return array[n];
    }
}
