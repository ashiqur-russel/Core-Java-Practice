package Assignment4;

public class Assignment4 {
    public static void main(String[] args) {
        int[] values = {9, -3, 5, 0, 1};

        int[] array = {1, 1, 2, 3, 11, 12, 13, 24, 38, 55};

        System.out.println(find(array, 4));

        //sort(values);

    }

    // Task 1

    public static void sort(int[] numbers) {

        if (numbers.equals(null)) {
            return;
        }
        if (numbers.length == 1) {
            return;
        }

        for (int i = 0; i < numbers.length - 1; i++) {
            int min = i;

            for (int j = 0; j < numbers.length - i - 1; j++) {

                if (numbers[j + 1] < numbers[j]) {
                    int temp = numbers[j + 1];
                    numbers[j + 1] = numbers[j];
                    numbers[j] = temp;
                }

            }
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

    }

    //Task 3

    public static int find(int[] numbers, int numberToCheck) {

        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int middle = (left + right) / 2;
            if (numberToCheck < numbers[0]) {
                return -1;
            }

            if (numberToCheck < numbers[middle]) {
                right = middle - 1;
            } else if (numberToCheck > numbers[middle]) {
                left = middle + 1;
            } else {
                return middle;
            }
        }
        return -(left + 1);

    }

}
