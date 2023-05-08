import java.util.Scanner;

public class GameDevelop {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //방향
        int[] dx = {0, 1, 0, -1};
        int[] dy = {-1, 0, 1, 0};

        //맵 크기
        int sizeMapX = 0;
        int sizeMapY = 0;

        sizeMapX = scanner.nextInt();
        sizeMapY = scanner.nextInt();
        scanner.nextLine(); //줄바꿈

        //캐릭터 위치 및 방향 입력
        int x = 0;
        int y = 0;
        int direction = 0;

        x = scanner.nextInt();
        y = scanner.nextInt();
        direction = scanner.nextInt();
        scanner.nextLine(); //줄바꿈

        //맵 입력
        int[][] gameMap = new int[sizeMapX][sizeMapY];
        for(int i = 0; i < sizeMapX; i++){
            for(int j = 0; j < sizeMapY; j++){
                gameMap[i][j] = scanner.nextInt();
            }
            scanner.nextLine(); //줄바꿈
        }
        gameMap[x][y] = 2;

        //Logic
        int backDirection = 0;
        int result = 1;

        while(true){
            //왼쪽 회전
            if(direction == 0){
                direction = 3;
                backDirection = 1;
            } else if(direction == 1){
                direction = 0;
                backDirection = 2;
            } else if(direction == 2){
                direction = 1;
                backDirection = 3;
            } else if(direction == 3){
                direction = 2;
                backDirection = 0;
            }

            //방향 + 전진 가능 체크
            if(x + dx[direction] > 0 && x + dx[direction] < sizeMapX
                    && y + dy[direction] > 0 && y + dy[direction] < sizeMapY
                    && gameMap[x + dx[direction]][y + dy[direction]] == 0){

                x = x + dx[direction];
                y = y + dy[direction];
                gameMap[x][y] = 2;
                result++;
            } else if(x - 1 > 0 && y - 1 > 0 && x + 1 < sizeMapX && y + 1 < sizeMapY
                    && gameMap[x - 1][y] != 0 && gameMap[x + 1][y] != 0 && gameMap[x][y - 1] != 0 && gameMap[x][y + 1] != 0) {
                //갈 곳 없는 경위 뒷칸 체크
                if(x + dx[backDirection] > 0 && x + dx[backDirection] < sizeMapX
                        && y + dy[backDirection] > 0 && y + dy[backDirection] < sizeMapY
                        && gameMap[x + dx[backDirection]][y + dy[backDirection]] != 1){

                    x = x + dx[backDirection];
                    y = y + dy[backDirection];
                } else {
                    break;
                }
            }
        }

        System.out.println("result = " + result);
    }

}
