package Telusko;

public class LinkedList {

    Node head;

    /**
     * Method to make node
     *
     * @param data to add data to the list
     */

    public void add(int data) {
        Node newnode = new Node();
        newnode.data = data;
        newnode.next = head;
        head = newnode;

    }

    // Method to show data added at Linked list

    public void showList() {
        Node node;
        node = head;
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }


}

