package Chapter5;

public class ArrayStringObject {

    public static void main(String[] args) {
        String s = "hello";
        char[] cs = {'h', 'e', 'l', 'l', 'o'};

        String s2 = new String("Hello");
        String s3 = new String(cs);


        System.out.println(s);
        System.out.println(s2);
        System.out.println(s3);


    }
}
