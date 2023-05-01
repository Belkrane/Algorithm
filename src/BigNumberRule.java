import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class BigNumberRule {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String nmk = scanner.nextLine();
        int n = Integer.parseInt(nmk.split(" ")[0]);
        int m = Integer.parseInt(nmk.split(" ")[1]);
        int k = Integer.parseInt(nmk.split(" ")[2]);

        int[] numbers = new int[n];

        //n개의 정수 입력 받기
        for(int i = 0; i < n; i++){
            numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers);
        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));

        int firstValue = numbers[n - 1];
        int secondValue = numbers[n -2];
        int kCounter = 0;
        int result = 0;

        for(int i = 0; i < m; i++){
            if(kCounter < k){
                kCounter++;
                result += firstValue;
            } else {
                result += secondValue;
                kCounter = 0;
            }
        }

        System.out.println("result = " + result);
    }
}
