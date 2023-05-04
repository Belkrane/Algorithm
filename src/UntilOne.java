import java.util.Scanner;

public class UntilOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int k;
        int result = 0;
        
        n = scanner.nextInt();
        k = scanner.nextInt();
        
        while(true){
            if(n % k == 0){
                n = n / k;
                result++;
            } else {
                result = result + (n % k);
                n = n - (n % k);
                if(n == 0){
                    n++;
                    result--;
                }
                /*n = n - 1;
                result++;*/
            }
            
            if(n == 1){
                break;
            }
        }

        System.out.println("result = " + result);
    }
}
