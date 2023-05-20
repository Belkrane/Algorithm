import java.util.Arrays;
import java.util.Scanner;

public class ExchangeElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, k; //n: 배열의 원소 개수, k 바꿔치기 가능횟수

        n = scanner.nextInt();
        k = scanner.nextInt();
        scanner.nextLine();

        int[] arrayA = new int[n];
        int[] arrayB = new int[n];

        for(int i = 0; i < n; i++){
            arrayA[i] = scanner.nextInt();
        }

        scanner.nextLine();

        for(int i = 0; i < n; i++){
            arrayB[i] = scanner.nextInt();
        }

        Arrays.sort(arrayA);
        Arrays.sort(arrayB);
        
        for(int i = 0; i < k; i++){
            arrayA[i] = arrayB[n - i - 1];
        }

        int result = 0;
        
        for(int i = 0; i < n; i++){
            result += arrayA[i];
        }

        System.out.println("result = " + result);
    }
}
