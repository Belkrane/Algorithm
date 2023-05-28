import java.util.Arrays;
import java.util.Scanner;

public class AntSoldier {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfFoodBox = scanner.nextInt();
        int[] foodBox = new int[numberOfFoodBox];
        int[] maxValue = new int[numberOfFoodBox];

        for(int i = 0; i < numberOfFoodBox; i++){
            foodBox[i] = scanner.nextInt();
        }

        scanner.nextLine();

        maxValue[0] = foodBox[0];
        maxValue[1] = max(maxValue[0], foodBox[1]);

        for(int i = 2; i < numberOfFoodBox; i++){
            maxValue[i] = max(maxValue[i - 1], maxValue[i - 2] + foodBox[i]);
        }

        System.out.println("maxValue = " + maxValue[numberOfFoodBox - 1]);
    }

    public static int max(int a, int b){
        if(a > b){
            return a;
        } else {
            return b;
        }
    }


}
