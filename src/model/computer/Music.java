package model.computer;

public interface Music {
    //public static final domyslnie
    String NAME = "MUSIC";
    //abstract method
    void playMusic();
    void pauseMusic();
    void stopMusic();

    //java 8 - default method (normal method with body)
    default void sayHelloFromMusic() {
        System.out.println("Hello from default music");
    }

    //static method
    static String getName() {
        return  NAME;
    }
    //JAVA 9 - PRIVATE STATIC METHOD
    private static void privateMethod() {
        System.out.println("hello from private method");
    }
}
