import java.util.LinkedList;
import java.util.Stack;

public class Dfs {
    public static void main(String[] args) {

        LinkedList[] linkedList = new LinkedList[9];
        boolean[] isVisited = new boolean[9];

        for(int i = 0; i < 9; i++){
            linkedList[i] = new LinkedList<>();
            isVisited[i] = false;
        }

        linkedList[1].add(2);
        linkedList[1].add(3);
        linkedList[1].add(8);
        linkedList[2].add(1);
        linkedList[2].add(7);
        linkedList[3].add(1);
        linkedList[3].add(4);
        linkedList[3].add(5);
        linkedList[4].add(3);
        linkedList[4].add(5);
        linkedList[5].add(3);
        linkedList[5].add(4);
        linkedList[6].add(7);
        linkedList[7].add(2);
        linkedList[7].add(6);
        linkedList[7].add(8);
        linkedList[8].add(1);
        linkedList[8].add(7);

        int currentNode = 1;
        int nextNode = 0;
        Stack stack = new Stack<>();

        while(true){
            if(!isVisited[currentNode]){
                isVisited[currentNode] = true;
                stack.push(currentNode);
                System.out.println("currentNode = " + currentNode);
            }

            for(int i = 0; i < linkedList[currentNode].size(); i++){
                nextNode = (int)linkedList[currentNode].get(i);
                if(!isVisited[nextNode]){
                    currentNode = nextNode;
                    break;
                }
            }

            if(currentNode != nextNode){
                if(!stack.isEmpty()) {
                    stack.pop();
                } else {
                    break;
                }
                if(!stack.isEmpty()) {
                    nextNode = (int) stack.peek();
                    currentNode = nextNode;
                }
            }
        }


    }

}
