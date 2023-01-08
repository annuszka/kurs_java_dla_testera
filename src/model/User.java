package model;

import java.util.Objects;

public class User implements Comparable<User> {
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lasttName) {
        this.lastName = lasttName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (!email.contains("@")) {
            throw new IllegalArgumentException("Incorrect email format");
        } else {
            this.email = email;
        }
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

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", isAdult=" + isAdult +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                isAdult == user.isAdult &&
                Objects.equals(firstName, user.firstName) &&
                Objects.equals(lastName, user.lastName) &&
                Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email, age, isAdult);
    }

    //this method will return 0 if they are the same
    @Override
    public int compareTo(User user) {
        int comparedResult = this.getFirstName().compareTo(user.getFirstName());
        if (comparedResult == 0) {
            comparedResult = this.getLastName().compareTo(user.getLastName());
        }
        return comparedResult;
    }
}
