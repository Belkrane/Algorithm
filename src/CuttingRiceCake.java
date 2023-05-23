import java.util.Arrays;
import java.util.Scanner;

public class CuttingRiceCake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfRiceCake = scanner.nextInt();
        int orderHeight = scanner.nextInt();
        scanner.nextLine();

        int[] riceCake = new int[numberOfRiceCake];

        for(int i = 0; i < numberOfRiceCake; i++){
            riceCake[i] = scanner.nextInt();
        }

        Arrays.sort(riceCake);

        int maxHeight = riceCake[numberOfRiceCake - 1];

        int result = binarySearch(riceCake, 0, maxHeight, orderHeight);

        System.out.println("result = " + result);
    }

    public static int binarySearch(int[] array, int start, int end, int item){
        int max = 0;

        while(start <= end){
            int pivot = (start + end) / 2;
            int result = 0;

            for(int i = 0; i < array.length; i++){
                if(array[i] > pivot){
                    result = result + (array[i] - pivot);
                }
            }

            if(result == item){
                max = pivot;
                break;
            } else if(result < item){
                end = pivot;
            } else if(result > item){
                start = pivot;
                max = pivot;
            }
        }

        return max;
    }
}
