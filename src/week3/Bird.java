package week3;

public class Bird implements Speaker {
    @Override
    public void speak() {
        System.out.println("chirp~");
    }

    @Override
    public void announce(String str) {
        System.out.println(str);
    }
}
