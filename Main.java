import java.util.*;
 
/**
 * 이진트리 순회 (넓이우선탐색 : 레벨탐색)
 */ 
class Node {
    int data;
    Node lt, rt;
    
    // 생성자
    public Node(int val) {
        data = val;
        lt = rt = null;
    }
}

public class Main {
    Node root;

    public void BFS(Node root) {
       Queue<Node> q = new LinkedList<>();
       q.offer(root);

       while (! q.isEmpty()) {
           Node cur = q.poll();
           System.out.print(cur.data + " ");
           if (cur.lt != null) q.offer(cur.lt);
           if (cur.rt != null) q.offer(cur.rt);
       }
    }
    public static void main(String[] args) {
        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);

        tree.BFS(tree.root);
    }
}