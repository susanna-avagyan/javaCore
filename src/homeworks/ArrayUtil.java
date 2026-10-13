package homeworks;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};

        System.out.println("________");

        //1 — Տպել զանգվածի բոլոր էլեմենտները
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        System.out.println("________");

        //2  — Տպել առաջին էլեմենտը
        System.out.println("First element: " + numbers[0]);

        System.out.println("________");


        //3 - Տպել վերջին էլեմենտը

        System.out.println("Last element: " + numbers[numbers.length - 1]);

        System.out.println("________");


        //4 -  Տպել զանգվածի երկարությունը
        System.out.println("Array length: " + numbers.length);

        System.out.println("________");

        //5 — Գտնել ամենափոքր թիվը
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("min = " + min);

        System.out.println("________");

        //6 — Տպել զանգվածի մեջտեղի էլեմենտը կամ էլեմենտները
        if (numbers.length % 2 == 1) {
            System.out.println("Middle element = " + numbers[numbers.length / 2]);
        }

        if (numbers.length % 2 == 0) {
            System.out.println("Middle elements = " + numbers[numbers.length / 2 - 1] + " " + numbers[numbers.length / 2]);
        }

        System.out.println("________");

        //7  - Հաշվել զույգ թվերի քանակը
        int evenCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println("Even numbers count = " + evenCount);

        System.out.println("________");
        //8 - Հաշվել կենտ թվերի քանակը
        int oddCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                oddCount++;
            }
        }
        System.out.println("Odd numbers count = " + oddCount);

        System.out.println("________");
        //9 - Հաշվել զանգվածի էլեմենտների գումարը
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println("Sum = " + sum);

        System.out.println("________");

        //10 ??/— Հաշվել միջին թվաբանականը
        double average = (double) sum / numbers.length;

        System.out.println(average);

        //Լրացուցիչ
        //Bonus 1 — Գտնել ամենամեծ թիվը
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Max = " + max);

        System.out.println("________");

        // Bonus 2 — Հաշվել դրական և բացասական թվերը
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                positiveCount++;
            }
            if (numbers[i] < 0) {
                negativeCount++;
            }
            if (numbers[i] == 0) {
                zeroCount++;
            }
        }

        System.out.println("Positive Count: " + positiveCount + " ");
        System.out.println("Negative Count: " + negativeCount + " ");
        System.out.println("Zero Count: " + zeroCount + " ");

        System.out.println("________");

        //Bonus 3 — Տպել զանգվածը հակառակ հերթականությամբ
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}



