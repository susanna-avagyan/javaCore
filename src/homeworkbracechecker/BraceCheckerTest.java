package homeworkbracechecker;

public class BraceCheckerTest {
    public static void main(String[] args) {

        BraceChecker braceChecker = new BraceChecker("Hello from [Java]");
        braceChecker.check();

        BraceChecker braceChecker1 = new BraceChecker("{Hello (Java)}");
        braceChecker1.check();

        BraceChecker braceChecker2 = new BraceChecker("{[()]}");
        braceChecker2.check();

        BraceChecker braceChecker3 = new BraceChecker("Hello Java");
        braceChecker3.check();

        BraceChecker braceChecker4 = new BraceChecker("Hello from [Java)");
        braceChecker4.check();

        BraceChecker braceChecker5 = new BraceChecker("{[(])}");
        braceChecker5.check();

        BraceChecker braceChecker6 = new BraceChecker("Hello from Java]");
        braceChecker6.check();

        BraceChecker braceChecker7 = new BraceChecker("{Hello Java");
        braceChecker7.check();

        BraceChecker braceChecker8 = new BraceChecker("((()))");
        braceChecker8.check();

        BraceChecker braceChecker9 = new BraceChecker("(()");
        braceChecker9.check();


    }
}
