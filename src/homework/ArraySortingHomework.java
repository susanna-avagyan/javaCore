package homework;

public class ArraySortingHomework {
    public static void main(String[] args) {
        //1
        int[] numbers = {12, 5, 8, -3, 21, 7, 0, 15, 2, 9};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }

            }
        }
        for (int k = 0; k < numbers.length; k++) {
            System.out.print(numbers[k] + " ");
        }
        System.out.println();

        //2
        int[] numbers1 = {12, 5, 8, -3, 21, 7, 0, 15, 2, 9};
        for (int i = 0; i < numbers1.length; i++) {
            for (int j = i; j < numbers1.length; j++) {
                if (numbers1[i] < numbers1[j]) {
                    int temp = numbers1[i];
                    numbers1[i] = numbers1[j];
                    numbers1[j] = temp;
                }
            }

        }
        for (int k = 0; k < numbers1.length; k++) {
            System.out.print(numbers1[k] + " ");
        }
    }
}