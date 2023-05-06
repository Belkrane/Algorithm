import java.util.Scanner;

public class UpDownLeftRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String movePath = scanner.nextLine();
        String[] path = movePath.split(" ");
        int x = 1;
        int y = 1;

        for(int i = 0; i < path.length; i++) {
            if (path[i].equals("U")) {
                if (x > 1) {
                    x--;
                }
            } else if (path[i].equals("D")) {
                if (x < n) {
                    x++;
                }
            } else if (path[i].equals("L")) {
                if (y > 1) {
                    y--;
                }
            } else if (path[i].equals(("R"))) {
                if (y < n) {
                    y++;
                }
            }
        }

        System.out.println("(x, y) = (" + x + " , " + y + ")");
    }
}
