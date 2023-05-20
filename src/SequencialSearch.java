import java.util.Scanner;

public class SequencialSearch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //원소의 개수 및 찾을 문자열 입력 받기
        String lengthAndName = scanner.nextLine();
        int length = 0;
        String name = "";
        length = Integer.parseInt(lengthAndName.split(" ")[0]);
        name = lengthAndName.split(" ")[1];

        String[] nameArray = new String[length];
        String nameInput = "";

        nameInput = scanner.nextLine();
        nameArray = nameInput.split(" ");

        int count = 0;

        for(int i = 0; i < length; i++){
            if(nameArray[i].equals(name)){
                count = i + 1;
                break;
            }
        }

        System.out.println("count = " + count);
    }
}
