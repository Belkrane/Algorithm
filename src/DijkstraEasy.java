import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
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
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                // 만일 2차원 배열의 첫 번째 원소가 같다면, 2번째 원소를 기준으로 내림차순 정렬한다.
                if(o1[0] == o2[0]) {
                    return Integer.compare(o2[1], o1[1]);
                }
                // 2차원 배열의 첫 번째 원소를 기준으로 오름차순 정렬한다.
                return Integer.compare(o1[0], o2[0]);
            }
        });

        for(int i = 0; i < map.length; i++){
            result[i] = INF;
        }

        result[start] = 0;
        isVisited[start] = true;
        priorityQueue.offer(new int[] {0, start});

        while(!priorityQueue.isEmpty()){
            int[] minValue = priorityQueue.poll();
            int now = minValue[1];
            isVisited[now] = true;

            for(int j = 0; j < map.length; j++){
                if(map[now][j] != -1){
                    result[j] = min(result[j], result[now] + map[now][j]);
                    if(!isVisited[j]){
                        priorityQueue.offer(new int[]{result[j], j});
                    }
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
