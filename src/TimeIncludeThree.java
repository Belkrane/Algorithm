import java.util.Scanner;

public class TimeIncludeThree {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = 0;
        
        for(int i = 0; i <= n; i++){
            for(int j = 0; j < 60; j++){
                for(int k = 0; k < 60; k++){
                    String timeString = Integer.toString(i) + Integer.toString(j) + Integer.toString(k);
                    if(timeString.contains("3")){
                        result++;
                    }
                }
            }
        }
        System.out.println("result = " + result);
    }
}
