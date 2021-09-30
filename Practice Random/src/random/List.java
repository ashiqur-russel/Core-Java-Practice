package random;

public class List {

    Node head;

    public void addData(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    public void showNode() {
        Node nnode;

        nnode = head;

        while (nnode != null) {
            System.out.println(nnode.data);
            nnode = nnode.next;
        }
    }

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


}
