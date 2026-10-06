package homework;

public class Homework2 {
    public static void main(String[] args) {
        //1
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {

                System.out.print("*" + " ");
            }
            System.out.println();

        }

        System.out.println("_________");
        //2

        for (int i = 0; i < 5; i++) {
            for (int j = 4; j >= i; j--) {

                System.out.print("*" + " ");
            }
            System.out.println();

        }

        System.out.println("_________");

        //3
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print("  ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("_________");

        //4
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");

            }
            for (int j = 0; j < 5 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //5
        System.out.println("_________");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        for (int i = 5; i < 9; i++) {
            for (int j = 4; j < i; j++) {

                System.out.print(" ");
            }

            for (int j = 8; j >= i; j--) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}


