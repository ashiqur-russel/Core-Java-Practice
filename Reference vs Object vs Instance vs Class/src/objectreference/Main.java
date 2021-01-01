package objectreference;

public class Main {
    public static void main(String[] args) {
        House blueHouse = new House("Blue");

        House anotherHouse = blueHouse;
        System.out.println(blueHouse.getColor());
        System.out.println(anotherHouse.getColor());
        System.out.println("------");

        anotherHouse.setColor("red");
        System.out.println(blueHouse.getColor());
        System.out.println(anotherHouse.getColor());
        System.out.println("------");

        House greenHouse = new House("green");
        anotherHouse = greenHouse;

        System.out.println(blueHouse.getColor());
        System.out.println(greenHouse.getColor());
        System.out.println(anotherHouse.getColor());


    }


}
