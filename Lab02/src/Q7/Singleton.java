package Q7;

public class Singleton {
    private static final Singleton uniqueInstance = new Singleton();
    
    private Singleton() {
    }

    public static Singleton getInstance() {
        return uniqueInstance;
    }

    public void foo() {
        System.out.println("Aha!");
    }
}