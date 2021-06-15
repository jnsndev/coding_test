import java.util.*;
 
/**
 * tree 말단 노드까지의 가장 짧은 경로
 */ 
class Node {
    int data;
    Node lt, rt;

    public Node(int val) {
        data = val;
        lt = rt = null;
    }
}

public class Main {
    Node root;

    public int DFS(int level, Node root) {
        if (root.lt == null && root.rt == null) return level;
        else return Math.min(DFS(level+1, root.lt), DFS(level+1, root.rt));
    }
    public static void main(String[] args) {
        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        System.out.println(tree.DFS(0, tree.root));
    }
}