public class Factorial {
    public static void main(String[] args) {
        int result = 0;
        result = factorial(5);
        System.out.println("result = " + result);
    }

    public static int factorial(int n){
        if(n == 1){
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
