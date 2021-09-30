package sort;

public class Bubble {

    public static void main(String[] args) {
        int[] values = {9, 2, 5, 0, 1, 6, 11, -3, -5};

        for (int i = 0; i < values.length - 1; i++) {
            for (int j = 0; j < values.length - i - 1; j++) {
                if (values[j + 1] < values[j]) {

                    int temp = values[j + 1];
                    values[j + 1] = values[j];
                    values[j] = temp;
                }

            }
        }


        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }

    }


}
