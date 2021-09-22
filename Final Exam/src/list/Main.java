package list;

public class Main {

    public static void main(String[] args) {

        List westMarketList = new List();
        westMarketList.add(new Record("Meyer Banana", 0.99, 24, ProductType.FOOD));
        westMarketList.add(new Record("Munins Soda", 1.27, 38, ProductType.BEVERAGES));
        westMarketList.add(new Record("Funny Water", 2.58, 150, ProductType.BEVERAGES));
        westMarketList.add(new Record("Glubs Glue", 4.99, 66, ProductType.NONFOOD));

        List eastMarketList = new List();
        westMarketList.add(new Record("Munins Soda", 1.27, 42, ProductType.BEVERAGES));
        eastMarketList.add(new Record("Peacar Strew", 2.99, 51, ProductType.FOOD));

        westMarketList.merge(eastMarketList);


    }

    /*

        private static void print(List list) {

        List.Node node = list.getRoot();

        while (node != null) {

            Record record = node.getRecord();

            node = node.getNext();

        }

    }
     */

    private static void print(Record record) {

        String str = record.getName() + ", " +
                record.getPrice();


    }

}
