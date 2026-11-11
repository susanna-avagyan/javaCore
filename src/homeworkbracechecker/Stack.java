package homeworkbracechecker;

public class Stack {
    private char[] array = new char[10];
    private int size;

    Stack() {
    }

    void push(char item) {
        if (size == array.length) {
            extend();
        }
        array[size] = item;
        size++;
    }

    private void extend() {
        char[] newArray = new char[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }


    char pop() {
        if (size > 0) {
            size--;
            return array[size];
        } else {
            System.out.println("error");
            return 0;
        }
    }

    boolean isEmpty() {
        return size == 0;
    }
}



