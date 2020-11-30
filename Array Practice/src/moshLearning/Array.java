package moshLearning;

public class Array {
    private int[] items;
    private int count = 0;

    public Array(int itemNo) {

        items = new int[itemNo];
    }

    //Insert item to the Array
    public void insert(int item) {

        if (items.length == count) {
            int[] newItems = new int[count * 2];
            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }

            items = newItems;

        }

        items[count] = item;
        count++;
    }

    // Method for print Array
    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.print(items[i] + " ");
        }
        System.out.println();
    }

    // Method for print Array
    public void delete(int position) {

        for (int j = position; j < count - 1; j++) {

            items[position] = items[position + 1];
            count--;


        }

    }

}
