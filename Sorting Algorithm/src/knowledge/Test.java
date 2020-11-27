package knowledge;

public class Test {

    public static void main(String[] args) {
        int[] num = {-3, 4, 0, 5, 9, 11, 6};

        // test

        for (int i = 0; i < num.length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < num.length; j++) {
                if (num[j] < num[min]) {
                    min = j;
                }

                int temp = num[i];
                num[i] = num[min];

                num[min] = temp;

            }
            System.out.print(num[i] + " ");
        }


    }
}
