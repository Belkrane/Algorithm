import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class EscapeMaze {

    private static int n;
    private static int m;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        scanner.nextLine();

        int[][] map = new int[n][m];

        for(int i = 0; i < n; i++){
            String tmpString = scanner.nextLine();
            for(int j = 0; j < m; j++){
                map[i][j] = Character.getNumericValue(tmpString.charAt(j));
            }
        }

        int reuslt = getDistanceFromMap(map, n - 1, m - 1);

        System.out.println("reuslt = " + reuslt);
    }

    public static int getDistanceFromMap(int[][] map, int x, int y){
        int distance = 1;
        int[][] distanceMap = new int[n][m];

        Queue queueX = new LinkedList<>();
        Queue queueY = new LinkedList<>();

        map[0][0] = 2;
        distanceMap[0][0] = distance;

        queueX.add(0);
        queueY.add(0);
        int currentX = 0;
        int currentY = 0;

        while(!queueY.isEmpty()){
            currentX = (int)queueX.remove();
            currentY = (int)queueY.remove();
            distance = distanceMap[currentX][currentY] + 1;

            if(currentX - 1 > 0 && map[currentX - 1][currentY] == 1){
                queueX.add(currentX - 1);
                queueY.add(currentY);
                map[currentX - 1][currentY] = 2;
                distanceMap[currentX - 1][currentY] = distance;
            }

            if(currentY - 1 > 0 && map[currentX][currentY - 1] == 1){
                queueX.add(currentX);
                queueY.add(currentY - 1);
                map[currentX][currentY - 1] = 2;
                distanceMap[currentX][currentY - 1] = distance;
            }

            if(currentX + 1 < n && map[currentX + 1][currentY] == 1){
                queueX.add(currentX + 1);
                queueY.add(currentY);
                map[currentX + 1][currentY] = 2;
                distanceMap[currentX + 1][currentY] = distance;
            }

            if(currentY + 1 < m && map[currentX][currentY + 1] == 1){
                queueX.add(currentX);
                queueY.add(currentY + 1);
                map[currentX][currentY + 1] = 2;
                distanceMap[currentX][currentY + 1] = distance;
            }

        }

        return distanceMap[x][y];
    }
}
