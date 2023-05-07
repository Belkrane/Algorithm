import java.util.Scanner;

public class KindomNight {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String position = scanner.nextLine();
        int x = 0;
        int y = 0;
        y = Integer.parseInt(String.valueOf(position.charAt(1)));
        switch (position.charAt(0)){
            case 'a':
                x = 1;
                break;
            case 'b':
                x = 2;
                break;
            case 'c':
                x = 3;
                break;
            case 'd':
                x = 4;
                break;
            case 'e':
                x = 5;
                break;
            case 'f':
                x = 6;
                break;
            case 'g':
                x = 7;
                break;
            case 'h':
                x = 8;
                break;
        }

        int result = 0;
        
        if(x - 2 >= 1 && y - 1 >= 1){
            result++;
        }
        if(x - 2 >= 1 && y + 1 <= 8){
            result++;
        }
        if(x + 2 <= 8 && y - 1 >= 1){
            result++;
        }
        if(x + 2 <= 8 && y + 1 <= 8){
            result++;
        }
        if(x - 1 >= 1 && y - 2 >= 1){
            result++;
        }
        if(x + 1 <= 8 && y - 2 >= 1){
            result++;
        }
        if(x - 1 >= 1 && y + 2 <= 8){
            result++;
        }
        if(x + 1 <= 8 && y + 2 <= 8){
            result++;
        }

        System.out.println("result = " + result);
    }
}
