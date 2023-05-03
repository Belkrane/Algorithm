import java.util.Arrays;
import java.util.Scanner;

public class NumberCardGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, m;
        n = scanner.nextInt();
        m = scanner.nextInt();

        int[] cardMatrx = new int[n * m];

        for(int i = 0; i < n * m; i++){
            cardMatrx[i] = scanner.nextInt();
        }

        int resultRows = 0;
        int biggestMinValue = 0;
        int rowPerMinValue = 10000;

        for(int i = 0; i < n * m; i++){
            if(cardMatrx[i] < rowPerMinValue){
                rowPerMinValue = cardMatrx[i];
            }

            if((i + 1) % m == 0){
                if(rowPerMinValue >= biggestMinValue){
                    biggestMinValue = rowPerMinValue;
                    rowPerMinValue = 10000;
                    resultRows = (i / m) + 1;
                }
            }
        }

        System.out.println("resultRows = " + resultRows);
        System.out.println("biggestMinValue = " + biggestMinValue);
    }
}
