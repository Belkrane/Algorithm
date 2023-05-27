import java.util.Scanner;

public class MakeOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int[] array = new int[number + 1];
        array[1] = 0;

        for(int i = 2; i < number + 1; i++){
            array[i] = array[i - 1] + 1;
            
            if(i % 5 == 0) array[i] = min(array[i], array[i / 5] + 1);
            
            if(i % 3 == 0) array[i] = min(array[i], array[i / 3] + 1);
            
            if(i % 2 == 0) array[i] = min(array[i], array[i / 2] + 1);

        }

        System.out.println("array[number] = " + array[number]);
    }

    public static int min(int a, int b){
        if(a <= b){
            return a;
        } else {
            return b;
        }
    }
}
