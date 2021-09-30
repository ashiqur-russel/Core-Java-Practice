package chapter6;

public class CharInString {
    static int numOfChar(char toFind, String searchString) {
        int sum = 0;
        for (int i = 0; i < searchString.length(); i++) {
            if (toFind == searchString.charAt(i)) {// if the char at position i?
                sum++;
            }
        }
        return sum;


    }

    public static void main(String[] args) {
        int num = numOfChar('i', "i am ingi");
        System.out.println(num);

    }

}
