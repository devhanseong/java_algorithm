package theory.browserhistory;

public class BrowserHistory {

    private Node head;
    private Node current;

    public BrowserHistory(String homepage) {
        Node newNode = new Node(homepage);
        this.head = newNode;
        this.current = newNode;
    }

    public void visit(String url) {
        Node visitNode = new Node(url);
        current.next = visitNode; //이후 기록 삭제
        visitNode.prev = current; //추가 된 노드의 이전 노드 추가
        current = visitNode; //현재 노드 변경
    }

    public String back(int steps) {
        for (int i = 0; i < steps; i++) {
            if (current.prev == null) {
                break;
            }
            current = current.prev;
        }
        return current.value;
    }

    public String forward(int steps) {
        for (int i = 0; i < steps; i++) {
            if (current.next == null) {
                break;
            }
            current = current.next;
        }
        return current.value;
    }

    class Node {
        private Node prev;
        private String value;
        private Node next;

        Node(String value) {
            this.value = value;
        }
    }
}
