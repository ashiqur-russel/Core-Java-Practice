package Assignment4;

public class Assignment4 {

    // Main method

    public static void main(String[] args) {
        int[] values = {9, -3, 5, 0, 1};

        int[] array = {1, 1, 2, 3, 11, 12, 13, 24, 38, 55};


        /* check all the validation for code is ok for task 3 */
        System.out.println("Array is [ 1, 1, 2, 3, 11, 12, 13, 24, 38, 55 ]");
        ;
        System.out.println(" find index of  0 :" + find(array, -1));
        System.out.println(" find index of  0 :" + find(array, 0));
        System.out.println(" find index of  1 :" + find(array, 1));
        System.out.println(" find index of  2 :" + find(array, 2));
        System.out.println(" find index of  4 :" + find(array, 4));
        System.out.println(" find index of  7 :" + find(array, 7));
        System.out.println(" find index of  44 :" + find(array, 44));
        System.out.println(" find index of  55 :" + find(array, 55));
        System.out.println(" find index of  59 :" + find(array, 59));


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
        if (numberToCheck > numbers[left])
            left = left + 1;
        return -(left + 1);

    }

}
