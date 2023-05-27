import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindParts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 0;
        n = scanner.nextInt();
        scanner.nextLine();
        int part;
        Map<Integer, Integer> ownPartsMap = new HashMap<Integer, Integer>();

        for(int i = 0; i < n; i++){
            part = scanner.nextInt();
            ownPartsMap.put(part, 1);
        }

        scanner.nextLine();

        int m = 0;
        m = scanner.nextInt();
        scanner.nextLine();
        int findParts = 0;

        for(int i = 0; i < m; i++){
            findParts = scanner.nextInt();
            if(ownPartsMap.containsKey(findParts)){
                System.out.println("findParts " + findParts + " = yes");
            } else {
                System.out.println("findParts " + findParts + " = no");
            }
        }

        scanner.nextLine();

    }
}
