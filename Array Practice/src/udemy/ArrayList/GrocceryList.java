package udemy.ArrayList;

import java.util.ArrayList;

public class GrocceryList {

    private int[] myNumbers = new int[50];

    private ArrayList<String> groceryList = new ArrayList<>();

    public void addGroceryItem(String item) {
        groceryList.add(item);

    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your List");

        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been Modified");
    }

    public void removeItem(int position) {
        groceryList.remove(position);
        System.out.println("Grocery item " + position + " has been removed");
    }

    public String fintItem(String searchItem) {
        int position = groceryList.indexOf(searchItem);
        if (position >= 0) {
            return groceryList.get(position);
        }
        return null;


    }


}
