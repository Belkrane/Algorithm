public class CountSort {

    public static void main(String[] args) {
        int[] array = {7, 5, 9, 0, 3, 1, 6, 2, 9, 1, 4, 8, 0, 5, 2};
        int[] countArray = new int[10];

        for(int i = 0; i < countArray.length; i++){
            countArray[i] = 0;
        }

        for(int i = 0; i < array.length; i++){
             countArray[array[i]]++;
        }

        for(int i = 0; i < countArray.length; i++){
            for(int j = 0; j < countArray[i]; j++){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
