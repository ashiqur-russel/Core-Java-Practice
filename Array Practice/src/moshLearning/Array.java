package moshLearning;

public class Array {
    private int[] items;

    public Array(int itemNo) {
        items = new int[itemNo];
    }

    public void print() {
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]);
        }
    }

}
