package week3;

public class Dog implements Speaker {
    @Override
    public void speak() {
        System.out.println("woof~");
    }

    @Override
    public void announce(String str) {
        System.out.println(str);
    }
}
