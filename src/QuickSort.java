import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {5, 7, 9, 0, 3, 1, 6, 2, 4, 8};

        quick_sort(array);

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    public static int[] quick_sort(int[] array){
        int pivot = 0;
        int leftIndex = 1;
        int rightIndex = array.length -1;

        if(array.length == 1){
            return array;
        }

        while(true){
            
            if(leftIndex > rightIndex){

                if(array[rightIndex] < array[pivot]){
                    int temp = array[pivot];
                    array[pivot] = array[rightIndex];
                    array[rightIndex] = temp;
                }
                break;
            }
            if(array[leftIndex] > array[pivot] && array[rightIndex] < array[pivot]){
                int temp = array[leftIndex];
                array[leftIndex] = array[rightIndex];
                array[rightIndex] = temp;
            }

            if(array[leftIndex] < array[pivot] && leftIndex < array.length){
                leftIndex++;
            }

            if(array[rightIndex] > array[pivot] && rightIndex > 0){
                rightIndex--;
            }
        }

        if(array.length == 2){
            return array;
        }

        int[] smallArray = new int[rightIndex];
        int[] bigArray = new int[array.length - rightIndex - 1];

        for(int i = 0; i < array.length; i++){

            if(i < rightIndex){
                smallArray[i] = array[i];
            } else if(i > rightIndex){
                bigArray[i - rightIndex - 1] = array[i];
            }
        }


        if(smallArray.length > 0 ){
            quick_sort(smallArray);
        }
        if(bigArray.length > 0){
            quick_sort(bigArray);
        }

        for(int i = 0; i < array.length; i++){
            if(i < rightIndex){
                array[i] = smallArray[i];
            } else if(i > rightIndex){
                array[i] = bigArray[i - rightIndex - 1];
            }
        }

        return array;
    }
}
