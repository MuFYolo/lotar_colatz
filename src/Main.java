import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input amount of numbers for Lotar Colatz check: ");
        long currentNumber = in.nextLong();
        System.out.println("All of numbers");
        int maxCount = 0;
        for (long i = 0; i <= currentNumber; i++) {
            long checkNumber = i;
            int counter = 0;
            if (i > 1) {
                while (checkNumber != 1) {
                    if (checkNumber % 2 == 0) {
                        checkNumber = checkNumber / 2;
                        counter++;
                    } else {
                        checkNumber = checkNumber * 3 + 1;
                        counter++;
                    }
                }
            }
            if (maxCount < counter) {
                maxCount = counter;
            }
            System.out.println("Current check number = " + i + ", action counter = " + counter + " Max action count is " + maxCount + " Current time for action");
            counter = 0;
        }
    }
}
