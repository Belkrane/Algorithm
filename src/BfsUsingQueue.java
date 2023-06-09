import java.util.LinkedList;
import java.util.Queue;

public class BfsUsingQueue {
    public static void main(String[] args) {
        LinkedList[] linkedLists = new LinkedList[9];

        for(int i = 0; i < 9; i++){
            linkedLists[i] = new LinkedList<>();
        }

        linkedLists[1].add(2);
        linkedLists[1].add(3);
        linkedLists[1].add(8);
        linkedLists[2].add(1);
        linkedLists[2].add(7);
        linkedLists[3].add(1);
        linkedLists[3].add(4);
        linkedLists[3].add(5);
        linkedLists[4].add(3);
        linkedLists[4].add(5);
        linkedLists[5].add(3);
        linkedLists[5].add(4);
        linkedLists[6].add(7);
        linkedLists[7].add(2);
        linkedLists[7].add(6);
        linkedLists[7].add(8);
        linkedLists[8].add(1);
        linkedLists[8].add(7);


        BreadthFirstSearch(linkedLists);
    }

    public static void BreadthFirstSearch(LinkedList[] linkedList){
        boolean[] isVisited = new boolean[linkedList.length];

        for(int i = 0; i < linkedList.length; i++){
            isVisited[i] = false;
        }

        Queue queue = new LinkedList<>();
        int currentNode = 1;
        int nextNode = 0;

        queue.add(currentNode);
        isVisited[currentNode] = true;

        while(!queue.isEmpty()){
            currentNode = (int)queue.remove();
            System.out.println("currentNode = " + currentNode);

            for(int i = 0; i < linkedList[currentNode].size(); i++){
                nextNode = (int)linkedList[currentNode].get(i);
                if(!isVisited[nextNode]){
                    queue.add(nextNode);
                    isVisited[nextNode] = true;
                }
            }
        }
    }
}
