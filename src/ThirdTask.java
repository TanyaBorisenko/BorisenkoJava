import java.util.Scanner;

public class ThirdTask {

    public static void main(String[] args) {
        int[] numbers = new int[10];
        int index = 0;
        Scanner scanner = new Scanner(System.in);

        while (index < numbers.length && scanner.hasNextInt()) {
            numbers[index] = scanner.nextInt();
            index++;
        }

        getMultipleNumbers(numbers);
    }

    public static void getMultipleNumbers(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            if (number % 3 == 0 && number != 0) {
                System.out.println(number);
            }
        }
    }
}
