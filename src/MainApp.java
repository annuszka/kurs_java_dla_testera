import model.Bug;
import model.BugReporter;
import model.computer.*;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        //polimorfizm - do jednego typu referencji przypisane rozne formy obiektu, po lewe klasa najwyzej w hierarchii, po prawej klasy po niej dziedziczace
//        PC officeComputer = new PC("Office computer 1", "HP", 500, 128);
//        Computer officeComputer2 = new PC("Office computer 2", "HP", 500, 128);
//        Computer officeComputer3 = new PC("Office computer 3", "HP", 500, 128);
//        Computer laptop = new Laptop("Laptop", "Lenovo", 500, 128, 50);
//        Computer laptop2 = new Laptop("Laptop 2", "Lenovo", 500, 128, 50);
//
//        Computer[] computers = {officeComputer, officeComputer2, officeComputer3, laptop, laptop2};
//
//        for (Computer computer : computers) {
//            computer.switchOff();
//        }
//
//        officeComputer.showCompterName();
//        //rzutowanie referencji na inny typ zeby dostac sie do metody ktora jest tylko w klasie PC
//        ((PC) officeComputer2).showCompterName();
//
//        System.out.println(officeComputer.volumeUp());
//        System.out.println(officeComputer.volumeUp());
//        System.out.println(officeComputer.volumeDown());
//        System.out.println(officeComputer.volumeDown());
//        System.out.println(officeComputer.volumeDown());
//
//        officeComputer3.volumeUp();
//        System.out.println(officeComputer3.getVolumeLevel());
//        officeComputer3.volumeUp(50);
//        System.out.println(officeComputer3.getVolumeLevel());
//        officeComputer3.volumeUp(50);
//        System.out.println(officeComputer3.getVolumeLevel());
//
//        officeComputer3.volumeDown(10);
//        System.out.println(officeComputer3.getVolumeLevel());
//        officeComputer3.volumeDown(100);
//        System.out.println(officeComputer3.getVolumeLevel());
//
//        Laptop laptop3 = new Laptop("Laptop 3", "Lenovo", 500, 128, 50);
//
//        laptop3.playMusic();
//        laptop3.pauseMusic();
//        laptop3.stopMusic();
//
//        laptop3.playVideo();
//        laptop3.pauseVideo();
//        laptop3.stopVideo();
//
//        laptop3.sayHello();
//
//        int number = 10;
//        //boxing - convert primitive type to wrapper class
//        Integer intNumber = Integer.valueOf(10);
//        System.out.println(intNumber);
//        Integer newInt = 10;
//        System.out.println(newInt);
//
//        //unboxing - object to primitive type
//        int intValue = intNumber.intValue();
////reference types needed for example in lists etc
//        List<Integer> numbers= new ArrayList<>();
//composition - class 'has a'relation
//        Hdd hdd = new Hdd("Samsung", 500);
//        Ram ram = new Ram("AAA", 128);
//        Computer mac = new Laptop("Mac", "PRO", hdd, ram, 100);
//        System.out.println(mac.getRam().getSize());

        BugReporter bugReporter = new BugReporter("User", "Testowy", "user@testowy.pl");
        Bug bug = new Bug("Internet is not working", bugReporter, 5);

        System.out.println(bug);

        bug.setBugStatus(true);
        System.out.println(bug);

    }
}
