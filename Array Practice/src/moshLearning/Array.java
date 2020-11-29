package moshLearning;

public class Array {
    private int[] items;
    private int count = 0;

    public Array(int itemNo) {
        items = new int[itemNo];
    }

    //Insert item to the Array
    public void insert(int item) {
        items[count] = item;
        count++;
    }

    // Method for print Array
    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }

}
