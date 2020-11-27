package sort;

public class Selection {

    public static void main(String[] args) {
        int[] arr = {0, 5, -3, 8, 6, 11, 4};

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            int min = i; // set minimum to first index num[0]

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }

                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }

            System.out.print(arr[i] + " ");
        }
    }
}
