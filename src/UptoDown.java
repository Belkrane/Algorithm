import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class UptoDown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] array = new Integer[n];

        for(int i = 0; i < n; i++){
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array, Collections.reverseOrder());

        System.out.println("result = " + Arrays.toString(array));
    }
}
