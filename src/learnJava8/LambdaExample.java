package learnJava8;

public class LambdaExample {
    public static void main(String[] args) {
        Greeting greeting = () -> System.out.println("Hello World!");
        greeting.sayHello();
    }
}
