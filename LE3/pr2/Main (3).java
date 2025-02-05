
interface Testable {
    void display();
}

class Test implements Testable {
    public void display() {
        System.out.println("Display from Test class.");
    }
}

abstract class AbsTest implements Testable {
    public abstract void display();
}

public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        test.display();
    }
}