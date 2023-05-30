import java.util.Arrays;
import java.util.Scanner;

public class DijkstraEasy {
    private static final int INF = 1000000000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfNodes = 0;
        int numberOfEdges = 0;
        int start = 0;
        numberOfNodes = scanner.nextInt();
        numberOfEdges = scanner.nextInt();
        scanner.nextLine();
        start = scanner.nextInt();
        scanner.nextLine();

        int[][] map = new int[numberOfNodes + 1][numberOfNodes + 1];

        for(int i = 0; i < numberOfNodes + 1; i++){
            for(int j = 0; j < numberOfNodes + 1; j++){
                map[i][j] = -1;
            }
        }

        for (int i = 0; i < numberOfEdges; i++) {
            int startNode = scanner.nextInt();
            int endNode = scanner.nextInt();
            int edge = scanner.nextInt();

            map[startNode][endNode] = edge;

            scanner.nextLine();
        }

        int[] result = dijstra(map, start);

        System.out.println("result = " + Arrays.toString(result));
    }

    public static int[] dijstra(int[][] map, int start){
        int[] result = new int[map.length];
        boolean[] isVisited = new boolean[map.length];

        for(int i = 0; i < map.length; i++){
            result[i] = INF;
        }

        result[start] = 0;
        isVisited[start] = true;

        for(int i = 1; i < map.length; i++){
            int minValue = INF;
            int now = start;

            for(int j = 1; j < result.length; j++){
                if(result[j] < minValue && !isVisited[j]){
                    minValue = result[j];
                    now = j;
                }
            }

            isVisited[now] = true;

            for(int j = 0; j < map.length; j++){
                if(map[now][j] != -1){
                    result[j] = min(result[j], result[now] + map[now][j]);
                }
            }
        }

        return result;
    }

    public static int min(int a, int b){
        if (a > b){
            return b;
        } else {
            return a;
        }
    }
}
