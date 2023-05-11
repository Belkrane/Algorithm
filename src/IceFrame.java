import java.util.Scanner;

public class IceFrame {

    private static int n;
    private static int m;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        scanner.nextLine();
        int[][] iceFrame = new int[n][m];

        for(int i = 0; i < n; i++){
            String tempString = scanner.nextLine();
            for(int j = 0; j < m; j++){
                iceFrame[i][j] = Character.getNumericValue(tempString.charAt(j));
            }
        }
        
        int result = 0;
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(DFS(iceFrame, i, j)){
                    result++;
                }
            }
        }

        System.out.println("result = " + result);
    }

    public static boolean DFS(int[][] iceFrame, int x, int y){

        if(iceFrame[x][y] == 1){
            return false;
        }

        iceFrame[x][y] = 1;

        if(x + 1 < n && iceFrame[x + 1][y] == 0){
            DFS(iceFrame, x + 1, y);
        }

        if(y + 1 < m && iceFrame[x][y + 1] == 0){
            DFS(iceFrame, x, y + 1);
        }

        if(x - 1 > 0 && iceFrame[x - 1][y] == 0){
            DFS(iceFrame, x - 1, y);
        }

        if(y - 1 > 0 && iceFrame[x][y -1] == 0){
            DFS(iceFrame, x, y - 1);
        }

        return true;
    }
}


