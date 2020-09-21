package week3;

public class SpeakTest {
    public static void main(String[] args) {
        Speaker dog = new Dog();
        Speaker bird = new Bird();
        Speaker human = new Human();

        dog.announce("Speaking from the dog.");
        dog.speak();

        bird.announce("Speaking from the bird.");
        bird.speak();

        human.announce("I am human.");
        human.speak();
    }
}
