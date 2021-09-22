package Chapter5;

public class ArrayStringObject {

    public static void main(String[] args) {
        String s = "hello";
        char[] cs = {'h', 'e', 'l', 'l', 'o'};
        String s2 = new String("Hello");
        String s3 = new String(cs);


        String string1 = new String("Hello");
        String string2 = new String("Hello");
        String string3 = new String("hello");
        String string4 = new String("helloo");

        System.out.println(string1 == string2);
        System.out.println(string2 == string3);
        System.out.println(string3 == string4);
        System.out.println(string1 == string4);

        System.out.println("<---->");

        System.out.println(string1.equals(string2));
        System.out.println(string2.equals(string3));
        System.out.println(string3.equals(string4));
        System.out.println(string1.equals(string4));

        System.out.println("<---->");

        System.out.println(s);
        System.out.println(s2);
        System.out.println(s3);


    }
}
