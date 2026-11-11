package homeworkbracechecker;

public class BraceChecker {

    Stack stack = new Stack();
    private String text;

    BraceChecker(String text) {
        this.text = text;
    }

    void check() {
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else if
            (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    System.out.println("Error: closed " + c + " at " + i + " but nothing was opened");
                    return;
                }

                char last = stack.pop();
                if (last == '(' && c != ')' ||
                        last == '[' && c != ']' ||
                        last == '{' && c != '}') {
                    System.out.println("Error: opened " + last + " but closed " + c + " at " + i);
                    return;
                }
            }
        }
        if (!stack.isEmpty()) {
            char last = stack.pop();
            System.out.println("Error: opened " + last + " but never closed");
            return;
        }

        System.out.println("No errors");

    }
}