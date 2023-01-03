package model;

public class User {
    private static int userCounter = 0;

    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private boolean isAdult;

    public User(String firstName, String lasttName, String email, int age) {
        this.firstName = firstName;
        this.lastName = lasttName;
        this.email = email;
        this.age = age;
        this.isAdult = isUserAdult();
        userCounter++;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLasttName() {
        return lastName;
    }

    public void setLasttName(String lasttName) {
        this.lastName = lasttName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isUserAdult() {
        return (age >= 18) ? true : false;
    }


    public void getFullName() {
        System.out.println(firstName + " " + lastName);
    }

    public void greetings(String name) {
        System.out.println("Hi " + name + ", nice to see you!");
    }

    public void greetings(String firstName, String lasttName) {
        System.out.println("Hi " + firstName + " " + ", nice to see you!");
    }

    public void howOldAreYou(String name, int userAge) {
        System.out.println("Hi " + name + " you are " + userAge + " years old");
    }

    public int yourAgePlus10(int userAge) {
        return userAge + 10;
    }

    public static int getUserCounter() {
        return userCounter;
    }
}