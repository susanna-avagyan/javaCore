package homework;

public class ArrayHomework {
    public static void main(String[] args) {
        //Խնդիր 1 — Հաշվել տվյալ թվի հանդիպումների քանակը
        int[] numbers1 = {6, 3, 8, 6, 1, 9, 6, 4, 2, 6};
        int n = 6;
        int count = 0;
        for (int i = 0; i < numbers1.length; i++) {
            if (n == numbers1[i]) {
                count++;
            }
        }
        System.out.println("Count of 6: " + count);
        System.out.println("______");

        //Խնդիր 2 — Շրջել զանգվածի էլեմենտների հերթականությունը
        int temp;
        int[] numbers2 = {1, 5, 8, 3, 9, 2, 7, 4, 6, 10};
        for (int i = 0; i < numbers2.length / 2; i++) {
            temp = numbers2[i];
            numbers2[i] = numbers2[numbers2.length - 1 - i];
            numbers2[numbers2.length - 1 - i] = temp;
        }
        for (int j = 0; j < numbers2.length; j++) {
            System.out.print(numbers2[j] + " ");
        }
        System.out.println();

        System.out.println("______");

        //Խնդիր 3 — Հաշվել կրկնվող թվերի քանակը
        int[] numbers3 = {3, 6, 8, 3, 9, 6, 2, 3, 5, 6};
        int repeatedCount = 0;
        for (int i = 0; i < numbers3.length; i++) {
            boolean alreadyChecked = false;
            for (int j = 0; j < i; j++) {
                if (numbers3[i] == numbers3[j]) {
                    alreadyChecked = true;
                    break;
                }
            }
            if (!alreadyChecked) {
                for (int j = i + 1; j < numbers3.length; j++) {
                    if (numbers3[i] == numbers3[j]) {
                        repeatedCount++;
                        break;
                    }
                }
            }
        }
        System.out.println("Repeated numbers count: " + repeatedCount);

        System.out.println("______");

        //Խնդիր 4 — Հաշվել ձայնավորների քանակը
        char[] chars = {'բ', 'ա', 'ր', 'և', 'ա', 'շ', 'խ', 'ա', 'ր', 'հ'};
        int vowelsCount = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'ա' || chars[i] == 'ե' || chars[i] == 'է' || chars[i] == 'ի' || chars[i] == 'ո' || chars[i] == 'օ' || chars[i] == 'ը') {
                vowelsCount++;
            }
        }
        System.out.println("Vowels count: " + vowelsCount);

        System.out.println("______");
        //Bonus 1 - Գտնել երկրորդ ամենամեծ թիվը
        int[] numbers4 = {4, 9, 2, 15, 7, 15, 3, 11, 6, 8};
        int max = 0;
        int secondMax = 0;
        for (int i = 1; i < numbers4.length; i++) {
            if (numbers4[i] > max) {
                max = numbers4[i];
            }
            for (int j = 1; j < numbers4.length; j++) {
                if (numbers4[j] < max && numbers4[i] > secondMax) {
                    secondMax = numbers4[j];
                }
            }
        }
        System.out.println("Second maximum: " + secondMax);

        System.out.println("______");
        //Bonus 2 — Հեռացնել կրկնվող թվերը
        int[] numbers5 = {3, 6, 3, 8, 9, 6, 2, 3, 5, 6};
        for (int i = 0; i < numbers5.length; i++) {
            boolean repeated = false;
            for (int j = 0; j < i; j++) {
                if (numbers5[i] == numbers5[j]) {
                    repeated = true;
                    break;
                }
            }
            if (!repeated)
                System.out.print(numbers5[i] + " ");
        }
    }
}
