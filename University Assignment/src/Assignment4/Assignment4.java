package Assignment4;

public class Assignment4 {

    // Main method

    public static void main(String[] args) {

        // Array of Task 1
        int[] values = {9, -3, 5, 0, 1};
        System.out.print("After Sorting : ");
        sort(values);
        System.out.println();
        System.out.println();

        // Array of Task 2
        int[] array = {1, 1, 2, 3, 11, 12, 13, 24, 38, 55};

        /* check all the validation for code is ok for task 3 */
        System.out.println(find(array, 3));
        System.out.println(find(array, 0));
        System.out.println(find(array, 7));


        System.out.println();

        // Method call for Decimal to Binary convert with print.Calling non static Method

        Assignment4 task2 = new Assignment4();
        System.out.println(task2.decimalToBinary(10));



    }

    /**
     * Task 1
     * <p>
     * Write a Bubble Sort algorithm that repeatedly goes through an array and swaps adjacent elements that are not in order.
     * Function should do nothing with empty array Function should do nothing with one value Function should sort the given values
     * Function name: public void sort(int[] numbers) Example: int[] values = { 9, -3, 5, 0, 1};
     * int[] expectedOrder = { -3, 0, 1, 5, 9};
     *
     * @param numbers
     */

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

    /**
     * Task 3
     *
     * Write a Binary Search algorithm for finding an element in a sorted list.
     * We assume that Input array must be sorted
     * Function should return index of target element when found
     * Function should return negative index minus one of insertion point of target element, in case when was not found i.e. expected number is not found return a pointer to a place where it can be inserted
     * Function name: public static int find(int[] numbers, int numberToCheck) Example:
     * int[] array = { 1, 1, 2, 3, 11, 12, 13, 24, 38, 55 };
     * find (array, 3) result should be 3 find(array, 0) result should be -1 find(array, 7) result should be -5
     * This means that 4 was not found in the list, we calculated it’s insertion point that would be after 3 and before 11 which makes its index point 4 now we have to display it in negative index minus one that would become -4-1= -5
     *
     * @param numbers
     * @param numberToCheck
     * @return
     */

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

    /**
     * Task 2
     * <p>
     * Write a function which converts which converts a positive interger in binary value represention in a string.
     * Function name: public String decimalToBinary(int number) Example: number 17
     * Output :10001
     *
     * @param number
     * @return
     */

    public String decimalToBinary(int number) {

        String result = " ";

        while (number > 0) {

            int reminder = number % 2;

            result = reminder + result;

            number = number / 2;
        }

        return result;
    }

}