import Factory.Factory;

public class Main {
    public static void main(String[] args) {
        Factory facebook = new Factory("Facebook");
        facebook.post("ahmed", "123456", "hello world");
        Factory twitter = new Factory("Twitter");
        twitter.post("ahmed", "123456", "hello world");
        Factory instagram = new Factory("Instagram");
        instagram.post("ahmed", "123456", "hello world");
    }
}