package timudemy;

public class Case {


    private String model;
    private String manufacturer;
    private String powerSuply;
    private Dimension dimension;


    public Case(String model, String manufacturer, String powerSuply, Dimension dimension) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSuply = powerSuply;
        this.dimension = dimension;
    }

    public void pressButton() {
        System.out.println("Power Button pressed..");
    }

}
