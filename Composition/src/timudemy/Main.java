package timudemy;

public class Main {
    public static void main(String[] args) {
        Dimension dimensions = new Dimension(5, 10, 7);
        Case theCase = new Case("220B", "Dell", "240W", dimensions);
        Monitor theMonitor = new Monitor("27 inch ", "Acer", 27, new Resolution(2540, 1440));
        MotherBoard motherBoard = new MotherBoard("Asus", 4, 6, "v2.44", "BJ-200");

        PC thePc = new PC(theCase, theMonitor, motherBoard);

        thePc.getMonitor().drawPixelAt(1500, 1200, "red");

        thePc.getMotherBoard().loadProgram("Windows 1.0");
        thePc.getTheCase().pressButton();
    }


}
