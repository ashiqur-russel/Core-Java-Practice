public class EvenDigitSum {
    public static void main(String[] args) {

        getEvenDigitSum(000);
        getEvenDigitSum(12345);
        getEvenDigitSum(-145);
        getEvenDigitSum(1);
        getEvenDigitSum(2);

    }

    public static void getEvenDigitSum(int num) {

        int evenSum = 0;

        // Return  -1 if number is negative
        if (num < 0) {
            //return -1;
            evenSum = -1;
        }
        // Return  0 if number is 0
        if (num == 0) {
            //return 0;
            evenSum = 0;
        }


        // check if the number is not 0 and not negative
        while (num != 0 && num > 0) {

            // store the remainder of number to rem variable
            int rem = num % 10;

            //Check the remainder id even or not, if even then add to the variable evenSum
            if (rem % 2 == 0) {
                evenSum += rem;
            }
            num = num / 10;

        }
        System.out.println(evenSum);

    }
}
