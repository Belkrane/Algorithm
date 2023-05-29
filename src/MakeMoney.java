import java.util.Arrays;
import java.util.Scanner;

public class MakeMoney
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 0;
        int m = 0;

        n = scanner.nextInt();
        m = scanner.nextInt();
        scanner.nextLine();

        int[] moneyType = new int[n];
        int[] result = new int[10001];

        for(int i = 0; i < 10001; i++){
            result[i] = 100001;
        }

        for(int i = 0; i < n; i++){
            moneyType[i] = scanner.nextInt();
            result[moneyType[i]] = 1;
        }

        Arrays.sort(moneyType);

        for(int i = moneyType[0] + 1; i < m + 1; i++){
            for(int j = 0; j < n; j++){
                if(i - moneyType[j] > 0){
                    if((i - moneyType[j]) != 100001) {
                        result[i] = min(result[i], result[i - moneyType[j]] + 1);
                    }
                }
            }
        }
        if(result[m] != 100001) {
            System.out.println("result = " + result[m]);
        } else {
            System.out.println("result = -1");
        }
    }

    public static int min(int a, int b){
        if(a < b){
            return a;
        } else {
            return b;
        }
    }
}
