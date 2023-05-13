public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {5, 7, 9, 0, 3, 1, 6, 2, 4, 8};

        for(int i = 1; i < array.length; i++){
            for(int j = i; j > 0; j--){
                if(array[j] < array[j - 1]){
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                } else {
                    break;
                }
            }
        }

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
