public class Task4 {

    public static void main(String[] args) {
        System.out.println(numberCheck(153));
        System.out.println(numberCheck(120));
        System.out.println(numberCheck(371));
    }

    public static boolean numberCheck(int number) {

        int num = number;

        int sum = 0;
        while (num != 0) {

            int digit = num % 10;
            num = num / 10;

            int x = digit * digit * digit;
            sum = sum + x;
        }

        return sum == number;
    }
}

