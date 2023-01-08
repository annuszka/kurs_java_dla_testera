import model.Bug;
import model.BugReporter;
import model.User;
import model.computer.*;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Collectors;

public class MainApp {
    public static void main(String[] args) {
        //polimorfizm - do jednego typu referencji przypisane rozne formy obiektu, po lewe klasa najwyzej w hierarchii, po prawej klasy po niej dziedziczace
//        PC officeComputer = new PC("Office computer 1", "HP", 500, 128);
//        Computer officeComputer2 = new PC("Office computer 2", "HP", 500, 128);
//        Computer officeComputer3 = new PC("Office computer 3", "HP", 500, 128);
//        Computer laptop = new Laptop("Laptop", "Lenovo", 500, 128, 50);
//        Computer laptop2 = new Laptop("Laptop 2", "Lenovo", 500, 128, 50);
//        Computer[] computers = {officeComputer, officeComputer2, officeComputer3, laptop, laptop2};
//        for (Computer computer : computers) {
//            computer.switchOff();
//        }
//        officeComputer.showCompterName();
//        //rzutowanie referencji na inny typ zeby dostac sie do metody ktora jest tylko w klasie PC
//        ((PC) officeComputer2).showCompterName();
//        System.out.println(officeComputer.volumeUp());
//        System.out.println(officeComputer.volumeUp());
//        System.out.println(officeComputer.volumeDown());
//        System.out.println(officeComputer.volumeDown());
//        System.out.println(officeComputer.volumeDown());
//        officeComputer3.volumeUp();
//        System.out.println(officeComputer3.getVolumeLevel());
//        officeComputer3.volumeUp(50);
//        System.out.println(officeComputer3.getVolumeLevel());
//        officeComputer3.volumeUp(50);
//        System.out.println(officeComputer3.getVolumeLevel());
//        officeComputer3.volumeDown(10);
//        System.out.println(officeComputer3.getVolumeLevel());
//        officeComputer3.volumeDown(100);
//        System.out.println(officeComputer3.getVolumeLevel());
//        Laptop laptop3 = new Laptop("Laptop 3", "Lenovo", 500, 128, 50);
//        laptop3.playMusic();
//        laptop3.pauseMusic();
//        laptop3.stopMusic();
//        laptop3.playVideo();
//        laptop3.pauseVideo();
//        laptop3.stopVideo();
//        laptop3.sayHello();
//        int number = 10;
//        //boxing - convert primitive type to wrapper class
//        Integer intNumber = Integer.valueOf(10);
//        System.out.println(intNumber);
//        Integer newInt = 10;
//        System.out.println(newInt);
//        //unboxing - object to primitive type
//        int intValue = intNumber.intValue();
////reference types needed for example in lists etc
//        List<Integer> numbers= new ArrayList<>();
//composition - class 'has a'relation
//        Hdd hdd = new Hdd("Samsung", 500);
//        Ram ram = new Ram("AAA", 128);
//        Computer mac = new Laptop("Mac", "PRO", hdd, ram, 100);
//        System.out.println(mac.getRam().getSize());

//        BugReporter bugReporter = new BugReporter("User", "Testowy", "user@testowy.pl");
//        Bug bug = new Bug("Internet is not working", bugReporter, 5);
//        System.out.println(bug);
//        bug.setBugStatus(true);
//        System.out.println(bug);
//        List<String> names = new ArrayList<>();
//        names.add("Pixie");
//        names.add("Jess");
//        names.add("Bulwa");
//        names.add("Macchi");
//        names.add("Mela");
//        names.add("Chalka");
//
//        System.out.println(names);
//        System.out.println(names.contains("Pixie"));
//        System.out.println(names.isEmpty());
//        System.out.println("First name on the list: " + names.get(0));
//        names.remove(names.size() - 1);
//        for (String name : names) {
//            System.out.println(name);
//        }
//
//        Collections.sort(names);
//        System.out.println(names);
//        Collections.reverse(names);
//        System.out.println(names);
//array list:
//        List<User> users = new ArrayList<>();
//        users.add(new User("Ala", "Testowa", "ala@test.pl", 20));
//        users.add(new User("Helena", "Testowa", "ala@test.pl", 28));
//        users.add(new User("Bożena", "Testowa", "ala@test.pl", 40));
//        users.add(new User("Kuba", "Testowa", "ala@test.pl", 35));
//        users.add(new User("Michał", "Testowy", "ala@test.pl", 31));
//        for (User user : users) {
//            System.out.println(user.getFirstName());
//        }
//
//        Collections.sort(users, Comparator.comparing(User::getFirstName));
//        System.out.println(users);
//        Collections.sort(users, Comparator.comparingInt(User::getAge).reversed());
//        System.out.println(users);

        //set - unique objects, treeset to sort
//        Set<String> names = new HashSet<>();
//        names.add("Pikuś");
//        names.add("Pixie");
//        names.add("Pikuś");
//        names.add("Pikuś");
//        names.add("Pik");
//        names.add("Atos");
//        names.add("Azorek");
//        names.add("Jess");
//        System.out.println(names.size());
//        for (String name : names) {
//            System.out.println(name);
//        }
//        Set<String> sortedNames = new TreeSet<>(names);
//        System.out.println("sorted set:");
//        for (String name : sortedNames) {
//            System.out.println(name);
//        }
//        //set with objects
//        Set<User> users = new HashSet<>();
//        users.add(new User("Ala", "Testowa", "ala@test.pl", 20));
//        users.add(new User("Helena", "Testowa", "ala@test.pl", 28));
//        users.add(new User("Bożena", "Testowa", "ala@test.pl", 40));
//        users.add(new User("Kuba", "Klaun", "ala@test.pl", 35));
//        users.add(new User("Michał", "Testowy", "ala@test.pl", 31));
//        // in order to sort we need to use comparable interface in user class and overwrite compareTo method
//        Set<User> sortedUsers = new TreeSet<>(users);
//        for (User user : sortedUsers) {
//            user.getFullName();
//        }
        //map - hashset when we don't care about order, LinkedHashMap - in order of adding, treemap - can be sorted
//        Map<Integer, String> names = new LinkedHashMap<>();
//        names.put(1, "Bartek1");
//        names.put(10, "Bartek10");
//        names.put(20, "Bartek20");
//        names.put(0, "Bartek0");
//        names.put(5, "Bartek5");
//
//        for (Map.Entry<Integer, String> entry : names.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }
//        System.out.println("sorted map");
//        Map<Integer, String> sortedNames = new TreeMap<>(names);
//        for (Map.Entry<Integer, String> entry : sortedNames.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }
        //exercise
//        List<Bug> bugsList = new ArrayList<>();
//        bugsList.add(new Bug("NOTHING IS WORKING!!!", new BugReporter("Bernard", "Clown",
//                "clown@nt.no"), 1));
//        bugsList.add(new Bug("Some issue", new BugReporter("Bernard", "Clown",
//                "clown@nt.no"), 2));
//        bugsList.add(new Bug("500 error", new BugReporter("Arnold", "Crown",
//                "arn@nt.no"), 5));
//        bugsList.add(new Bug("S WORKING!!!", new BugReporter("Frank", "Slow",
//                "frank@test.pl"), 1));
//        bugsList.add(new Bug("NOTHING IS WORKING!!!", new BugReporter("Bernard", "Clown",
//                "clown@nt.no"), 1));
//        for (Bug bug : bugsList) {
//            System.out.println(bug.getBugDescription());
//        }
//        System.out.println("set: ");
//        //we want to eliminate duplicates: (it won't work if we don't have equals and hash methods
//        Set<Bug> bugSet = new HashSet<>(bugsList);
//        for (Bug bug : bugSet) {
//            System.out.println(bug.getBugDescription());
//        }
//        //sort
//        Set<Bug> bugsTreeSet = new TreeSet<>(bugSet);
//        System.out.println("tree set:");
//        for (Bug bug : bugsTreeSet) {
//            System.out.println(bug.getBugDescription());
//        }
        //stream
        List<String> names = new ArrayList<>();
        names.add("Pixie");
        names.add("Pikuś");
        names.add("Jess");
        names.add("Chałka");
        names.add("Macchi");
        names.add("Bulwa");
        names.add("Mela");
        names.add("Piksi");
        names.stream().filter(str -> str.startsWith("P"))
                .filter(str -> str.contains("Pik"))
                .filter((str -> str.endsWith("i")))
                .forEach(str -> System.out.println(str));
        List<String> pikNames = names.stream().filter(s -> s.startsWith("Pi")).collect(Collectors.toList());
        System.out.println(pikNames);

        names.stream()
                .map(str -> str.toUpperCase())
                .forEach(str -> System.out.println(str));

        names.stream()
                .filter(str -> str.length() <=4)
                .map(str -> "Short name: " + str)
                .forEach(str -> System.out.println(str));
       long count = names.stream()
                .filter(str -> str.length() <=4)
                .count();
        System.out.println("Count: " + count);
        boolean anyMatch = names.stream().anyMatch(s -> s.contains("a"));
        boolean allMatch = names.stream().allMatch(s -> s.length() > 3);
        boolean noneMatch = names.stream().noneMatch(s -> s.endsWith("z"));
        System.out.println(anyMatch + " " + allMatch + " " + noneMatch);

        List<User> users = new ArrayList<>();
        users.add(new User("Ala", "Testowa", "ala@test.pl", 20));
        users.add(new User("Ala", "Pomarańcz", "ala@test.pl", 20));
        users.add(new User("Helena", "Xielona", "hela@test.pl", 28));
        users.add(new User("Bożena", "Fioletowa", "boz@test.pl", 40));
        users.add(new User("Kuba", "Biały", "kuba@test.pl", 35));
        users.add(new User("Michał", "Czarny", "mich@test.pl", 31));

        List<User> sortedUsers = users.stream()
//                .sorted(Comparator.comparing(user -> user.getFirstName())) --> lambda can be replaced with method reference:
                .sorted(Comparator.comparing(User::getFirstName).thenComparing(User::getLastName))
                .collect(Collectors.toList());
        for (User user : sortedUsers) {
            System.out.println(user.getFirstName() + " " + user.getLastName() + " " + user.getAge());
        }
        //Optional type - wraps object (since java 1.8), protects from null point exception
        Optional<User> max = users.stream().max(Comparator.comparingInt(User::getAge));
        if (max.isPresent()) {
            //get to extract user from optional, it can be empty so first check if present
            System.out.println(max.get());
        } else {
            System.out.println("No such element found");
        }

        String ala = users.stream()
                .map(User::getFirstName)
                .filter(s -> s.equals("Ala"))
                .findFirst()
                .orElse("There is no Ala on the list");
        System.out.println(ala);

        Integer age = users.stream()
                .map(User::getAge)
                .max(Integer::compareTo)
                .orElse(-1);
        System.out.println(age);

        User bartek = users.stream()
                .filter(user -> user.getFirstName().startsWith("Bart"))
                .findFirst()
                .orElseGet(() -> new User("Bartek", "Nowy", "b@test.com", 25));
        System.out.println(bartek);

//        User ula = users.stream()
//                .filter(user -> user.getFirstName().startsWith("U"))
//                .findFirst()
//                .orElseThrow(() -> new IllegalStateException("There is no user with name starting with letter U on the list"));
//        System.out.println(ula);
    }
}
