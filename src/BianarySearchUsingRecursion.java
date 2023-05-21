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

        if(start > end){
            System.out.println("Can not find item");
        } else {
            if(array[pivot] > item){
                binarySearch(array, start, pivot - 1, item);
            } else if(array[pivot] < item){
                binarySearch(array, pivot + 1, end, item);
            } else {
                System.out.println("result = " + (int)(pivot + 1));
            }
        }
    }
}
