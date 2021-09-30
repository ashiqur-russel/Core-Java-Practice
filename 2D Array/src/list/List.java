package list;

import java.util.LinkedList;

public class List {
    public static void main(String[] args) {

        /**
         * List using built in Function
         */
        LinkedList<String> l1 = new LinkedList<String>();

        // Adding element to the list
        l1.add("A");
        l1.add("B");
        l1.addLast("C");
        l1.addFirst("D");
        l1.add(2, "E");

        // System.out.println(l1);

        // l1.remove("B");
        // System.out.println(l1);


        /**
         * Using get method
         */

        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));
        }
        System.out.println();
    }
}
