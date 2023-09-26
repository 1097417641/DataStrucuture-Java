package test;

public class FinalTest {
    
    public static void main(String[] args) {
        Test test = new Test();
        test.show();;
    }
}

class Test {
    final int x;

    {
        x = 10;
    }

    public void show() {
        System.out.println(this.x);
    }
}
