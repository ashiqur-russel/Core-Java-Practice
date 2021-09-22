package polymorphism;

class Car {
    private boolean engine;
    private int cylinder;
    private String name;
    private int wheels;

    public Car(int cylinder, String name) {
        this.cylinder = cylinder;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinder() {
        return cylinder;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return "Car -> Start Engine";
    }

    public String accelerate() {
        return "Car -> Accelerate";
    }

    public String brake() {
        return "Car -> Brake";
    }

}


class Audi extends Car {
    public Audi(int cylinder, String name) {
        super(cylinder, name);
    }

    @Override
    public String startEngine() {
        return "Audi -> Start Engine";

    }

    @Override
    public String accelerate() {
        return "Audi -> Accelerate";
    }

    @Override
    public String brake() {
        return "Audi -> Brake";
    }
}

public class Main {
    public static void main(String[] args) {

        Car car = new Car(6, "Base");

        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Audi audi = new Audi(8, "Golf 7");

        System.out.println(audi.startEngine());
        System.out.println(audi.accelerate());
        System.out.println(audi.brake());

        Ford ford = new Ford(8, "Golf 7");

        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());


    }

    static class Ford extends Car {
        public Ford(int cylinder, String name) {
            super(cylinder, name);
        }

        @Override
        public String startEngine() {
            return "Ford -> Start Engine";

        }

        @Override
        public String accelerate() {
            return "Ford -> Accelerate";
        }

        @Override
        public String brake() {
            return "Ford -> Brake";
        }
    }
}
