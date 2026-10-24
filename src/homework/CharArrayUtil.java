package homework;

public class CharArrayUtil {
    public static void main(String[] args) {
        char[] chars = {
                'J', 'a', 'v', 'a', ' ',
                'i', 's', ' ', 'f', 'u', 'n', '!'
        };
        //Խնդիր 1 — Տպել բոլոր սիմվոլները
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
        System.out.println();
        System.out.println("_____");

        //Խնդիր 2 — Հաշվել սիմվոլների քանակը
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            count++;
        }
        System.out.println("Characters count: " + count);
        System.out.println("First character: " + chars[0]);
        System.out.println("Last character: " + chars[chars.length - 1]);

        System.out.println("_____");

        //Խնդիր 3 — Հաշվել տրված սիմվոլի հանդիպումների քանակը
        char c = 'a';
        int count3 = 0;
        for (int i = 0; i < chars.length; i++) {
            if (c == chars[i]) {
                count3++;
            }
        }
        System.out.println("Character 'a' count: " + count3);
        System.out.println("_____");

        // Խնդիր 4 — Հաշվել ձայնավորների քանակը
        int count4 = 0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (chars[i] == vowels[j]) {
                    count4++;
                }
            }
        }
        System.out.println("Vowels count: " + count4);
        System.out.println("_____");
        //Խնդիր 5 — Հաշվել բաղաձայնների քանակը
        int count5 = 0;
        char[] consonants = {
                'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm',
                'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z',
                'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M',
                'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z'
        };
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < consonants.length; j++) {
                if (chars[i] == consonants[j])
                    count5++;
            }
        }
        System.out.println("Consonants count " + count5);
        System.out.println("_____");
        // Խնդիր 6 — Հաշվել բացատների քանակը
        int count6 = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                count6++;
            }
        }
        System.out.println("Spaces count: " + count6);
        System.out.println("_____");
        // Խնդիր 7 — Շրջել սիմվոլների հերթականությունը (Reverse)
        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = temp;
        }
        for (int j = 0; j < chars.length; j++) {
            System.out.print(chars[j]);
        }
        System.out.println();
        System.out.println("_____");


//Խնդիր 8 — Փոխել մեծատառերը և փոքրատառերը
        char[] chars1 = {
                'J', 'a', 'v', 'a', ' ',
                'i', 's', ' ', 'f', 'u', 'n', '!'};
        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] >= 'a' && chars1[i] <= 'z') {
                chars1[i] = (char) (chars1[i] - 32);
            }
        }
        System.out.print("Uppercase: ");
        for (int j = 0; j < chars1.length; j++) {
            System.out.print(chars1[j]);
        }
        char[] chars2 = {
                'J', 'a', 'v', 'a', ' ',
                'i', 's', ' ', 'f', 'u', 'n', '!'};
        for (int i = 0; i < chars2.length; i++) {
            if (chars2[i] >= 'A' && chars2[i] <= 'Z') {
                chars2[i] = (char) (chars2[i] + 32);
            }
        }
        System.out.println();
        System.out.print("Lowercase: ");
        for (int j = 0; j < chars2.length; j++) {
            System.out.print(chars2[j]);
        }
        System.out.println();
        System.out.println("_____");
//Խնդիր 9 — Փոխարինել տրված սիմվոլը
        char[] chars3 = {
                'J', 'a', 'v', 'a', ' ',
                'i', 's', ' ', 'f', 'u', 'n', '!'};
        char oldChar = 'a';
        char newChar = '*';
        for (int i = 0; i < chars3.length; i++) {
            if (chars3[i] == oldChar) {
                chars3[i] = newChar;
            }
        }
        for (int j = 0; j < chars3.length; j++) {
            System.out.print(chars3[j]);
        }
        System.out.println();
        System.out.println("_____");
        //Խնդիր 10 — Ստուգել Palindrome-ը
        char[] chars4 = {
                'J', 'a', 'v', 'a', ' ',
                'i', 's', ' ', 'f', 'u', 'n', '!'
        };
        boolean isPalidrome = true;
        for (int i = 0; i < chars4.length; i++) {
            if (chars4[i] == chars4[chars4.length - 1 - i]) {
                isPalidrome = true;
            } else {
                isPalidrome = false;
            }
        }
        System.out.println(isPalidrome);
        System.out.println("_____");
        //Bonus 1 — Գտնել սիմվոլի առաջին հանդիպման ինդեքսը
        char[] chars5 = {'a', 'b', 'c', 'a', 'd'};
        char target = 'a';
        int firstIndex = -1;
        for (int i = 0; i < chars5.length; i++) {
            if (chars5[i] == target) {
                firstIndex = i;
                break;
            }
        }
        System.out.println(firstIndex);


        System.out.println("_____");
        // Bonus 2 — Համեմատել երկու char զանգված
        char[] first = {'J', 'a', 'v', 'a'};
        char[] second = {'J', 'a', 'v', 'a'};
        boolean arrayEqual = true;
        for (int i = 0; i < first.length; i++) {
            if (first[i] != second[i]) {
                arrayEqual = false;
                break;
            }
        }
        System.out.println(arrayEqual);
        System.out.println("_____");
        //Bonus 3 — Հեռացնել կրկնվող սիմվոլները
        char[] chars6 = {'a', 'b', 'a', 'c', 'b', 'd', 'a'};
        for (int i = 0; i < chars6.length; i++) {
            boolean dublicate = false;
            for (int j = 0; j < i; j++) {
                if (chars6[i] == chars6[j]) {
                    dublicate = true;
                }
            }
            if (!dublicate) {
                System.out.print(chars6[i] + " ");
            }
        }
    }
}


