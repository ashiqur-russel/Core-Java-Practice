public class exam {

    int i = 1;

    public static void main(String[] args) {

        exam i = new exam();

        i.myMethod(i.i);
    }

    public void myMethod(int n) {
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        for (int i = 0; i < n; i++) {
            System.out.println("This is number " + i + 1);
        }

    }
}
