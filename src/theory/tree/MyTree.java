package theory.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// 트리 코딩 테스트 : 1. 구현 2. 순회 (level order, post order)
// level order : 주로 Queue를 이용한 FIFO, 너비 우선 탐색과 많이 유사하다.
// pre, in, post order : 접근 및 방문의 차이, 깊이 우선 탐색과 많이 유사하다.
public class MyTree {

    public static void main(String[] args) {
        MyBinaryTree bt = createTree();
        List<Node> visit = new ArrayList<>();
        bfs(bt, visit);
        System.out.println(visit);

        visit = new ArrayList<>();
        dfs(bt.root, visit);
        System.out.println(visit);
    }

    /**
     *  재귀를 이용한 깊이 우선 탐색 DFS
     *  재귀는 자기 자신을 호출하고, 반드시 base case가 있어야한다.
     *  base case가 존재하지 않으면 무한 루프에 빠짐.
     *  전위(pre) 순회 : 자식 노드 방문 전 자기 자신부터 방문
     *  중위(in) 순회 : 자식 노드 중 한쪽 노드를 다 방문하고 자기 자신을 방문
     *  후위(post) 순회 : 자식 노드 모두를 방문하고 자기 자신을 방문한다.
     */
    public static void dfs(Node currentNode, List<Node> visit) {
        if (currentNode == null) {
            return;
        }
        visit.add(currentNode);
        dfs(currentNode.leftChild, visit);
        dfs(currentNode.rightChild, visit);
    }

    public static void bfs(MyBinaryTree bt, List<Node> visit) {
        Queue<Node> q = new LinkedList<>();
        q.add(bt.root);

        while (!q.isEmpty()) {
            Node currentNode = q.remove();
            visit.add(currentNode);

            if (currentNode.leftChild != null) {
                q.add(currentNode.leftChild);
            }

            if (currentNode.rightChild != null) {
                q.add(currentNode.rightChild);
            }
        }
    }

    public static MyBinaryTree createTree() {
        MyBinaryTree bt = new MyBinaryTree();
        Node a = new Node("A");
        Node b = new Node("B");
        Node c = new Node("C");
        Node d = new Node("D");
        Node e = new Node("E");
        Node f = new Node("F");
        Node g = new Node("G");
        Node h = new Node("H");
        Node i = new Node("I");

        bt.root = a;

        a.addChildren(b, c);
        b.addChildren(d, e);
        c.addChildren(f, g);
        d.addChildren(h, i);
        return bt;
    }

    static class MyBinaryTree {
        Node root;
    }

    static class Node {
        Node leftChild;
        String value;
        Node rightChild;

        Node(String value) {
            this.value = value;
        }

        void addChildren(Node left, Node right) {
            leftChild = left;
            rightChild = right;
        }

        @Override
        public String toString() {
            return value;
        }
    }
}
