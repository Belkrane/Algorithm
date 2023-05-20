import java.util.Arrays;
import java.util.Scanner;

public class lowScoreStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] studentName = new String[n];
        int[] studentScore = new int[n];
        String[] scoreArray = new String[101];

        for(int i = 0; i < n; i++){
            String[] nameAndScore = scanner.nextLine().split(" ");

            studentName[i] = nameAndScore[0];
            studentScore[i] = Integer.parseInt(nameAndScore[1]);

        }

        for(int i = 0; i < 101; i++){
            scoreArray[i] = "";
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < 101; j++){
                if(studentScore[i] == j){
                    scoreArray[j] = scoreArray[j] + studentName[i] + " ";
                }
            }
        }

        for(int i = 0; i < 101; i++){
            if(!"".equals(scoreArray[i])){
                System.out.print(scoreArray[i] + " ");
            }
        }

    }
}
