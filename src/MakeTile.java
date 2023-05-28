import java.util.Scanner;

public class MakeTile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] array = new int[n + 1];

        array[1] = 1;
        array[2] = 3;

        for(int i = 3; i < n + 1; i++){
            array[i] = (array[i - 1] + (2 * array[i - 2])) % 796796;
        }

        System.out.println("result = " + array[n]);
    }
}
