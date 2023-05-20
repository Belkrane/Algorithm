import java.util.Scanner;

public class BianarySearchUsingRecursion {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //입력 개수와 찾을 숫자를 입력 받음
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

        binarySearch(array, 0, length, item);
    }

    public static void binarySearch(int[] array, int start, int end, int item){
        int pivot = (start + end) / 2;
        
        if(array[pivot] > item){
            if(pivot - 1 > 0){
                binarySearch(array, start, pivot - 1, item);
            } else {
                System.out.println("Can not find Item");
            }
        } else if(array[pivot] < item){
            if(pivot + 1 < end){
                binarySearch(array, pivot + 1, end, item);
            } else {
                System.out.println("Can not find Item");
            }
        } else {
            System.out.println("result = " + pivot + 1);
        }

    }
}
