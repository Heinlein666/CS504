package week3;

public class Human implements Speaker {
    @Override
    public void speak() {
        System.out.println("hello!");
    }

    @Override
    public void announce(String str) {
        System.out.println(str);
    }
}
