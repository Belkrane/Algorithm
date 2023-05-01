import java.lang.reflect.Array;

public class Change {
    public static void main(String[] args) {
        int n = 1260;
        int count = 0;
        count += n / 500;
        n = n - (500 * (n / 500));
        count += n / 100;
        n = n - (100 * (n / 100));
        count += n /  50;
        n = n - (50 * (n /50));
        count += n / 10;
        n = n - (10 * (n / 10));

        if(n == 0){
            System.out.println("count = " + count);
        } else {
            System.out.println("거스름돈을 줄 수 없는 금액입니다: " + n);
        }
    }
}
