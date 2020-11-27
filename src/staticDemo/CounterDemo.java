package staticDemo;

public class CounterDemo {
    static int count = 0; // 1, 2

    CounterDemo()
    {
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {

        CounterDemo ob1 = new CounterDemo(); //  1
        CounterDemo ob2 = new CounterDemo(); //  2
        CounterDemo ob3 = new CounterDemo(); //  3
    }
}
