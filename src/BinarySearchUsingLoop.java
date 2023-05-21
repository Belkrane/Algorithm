import java.util.Scanner;

public class BinarySearchUsingLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = 0;
        int item = 0;

        length = scanner.nextInt();
        item = scanner.nextInt();

        scanner.nextLine();

        int[] array = new int[length];

        for(int i = 0; i < length; i++){
            array[i] = scanner.nextInt();
        }

        scanner.nextLine();
        
        int result = binarySearch(array, item, length);
        
        if(result == -1){
            System.out.println("Can not find item!!");
        } else {
            System.out.println("result = " + result);
        }
    }

    public static int binarySearch(int[] array, int item, int length){
        int start = 0;
        int end = length;
        int pivot = 0;

        while(true){
            if(start < 0 || end > length || start > end){
                pivot = -1;
                break;
            } else {
                pivot = (start + end) / 2;
            }

            if(array[pivot] == item){
                pivot++;
                break;
            }

            if(item < array[pivot]) {
                end = pivot - 1;
            } else if(item > array[pivot]){
                start = pivot + 1;
            }
        }

        return pivot;
    }
}
