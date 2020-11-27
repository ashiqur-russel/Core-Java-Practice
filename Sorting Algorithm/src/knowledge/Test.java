package knowledge;

public class Test {

    public static void main(String[] args) {
        int[] num = {-3, 4, 0, 5, 9, 11, 6};

        for (int i = 0; i < num.length - 1; i++) {
            for (int j = 0; j < num.length - i - 1; j++) {
                if (num[j + 1] < num[i]) {
                    int temp = num[j + 1];
                    num[j + 1] = num[j];
                    num[j] = temp;
                }
            }
            System.out.println(num[i]);

        }

        // Selection sort test

        for (int i = 0; i < num.length - 1; i++) {
            int min = i; // (1.0,)

            for (int j = i + 1; j < num.length; j++) { // j= 2
                if (num[j] < num[min]) { // 1.false,
                    min = j;
                }

                int temp = num[i]; // temp = -3
                num[i] = num[min]; //

                num[min] = temp;

            }
            System.out.print(num[i] + " ");
        }


    }
}
