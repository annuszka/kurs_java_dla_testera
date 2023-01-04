import model.computer.Computer;
import model.computer.Laptop;
import model.computer.PC;

public class MainApp {
    public static void main(String[] args) {
        //polimorfizm - do jednego typu referencji przypisane rozne formy obiektu, po lewe klasa najwyzej w hierarchii, po prawej klasy po niej dziedziczace
        PC officeComputer = new PC("Office computer 1", "HP", 500, 128);
        Computer officeComputer2 = new PC("Office computer 2", "HP", 500, 128);
        Computer officeComputer3 = new PC("Office computer 3", "HP", 500, 128);
        Computer laptop = new Laptop("Laptop", "Lenovo", 500, 128, 50);
        Computer laptop2 = new Laptop("Laptop 2", "Lenovo", 500, 128, 50);

        Computer[] computers = {officeComputer, officeComputer2, officeComputer3, laptop, laptop2};

        for (Computer computer : computers) {
            computer.switchOff();
        }

        officeComputer.showCompterName();
        //rzutowanie referencji na inny typ zeby dostac sie do metody ktora jest tylko w klasie PC
        ((PC) officeComputer2).showCompterName();

        System.out.println(officeComputer.volumeUp());
        System.out.println(officeComputer.volumeUp());
        System.out.println(officeComputer.volumeDown());
        System.out.println(officeComputer.volumeDown());
        System.out.println(officeComputer.volumeDown());

        officeComputer3.volumeUp();
        System.out.println(officeComputer3.getVolumeLevel());
        officeComputer3.volumeUp(50);
        System.out.println(officeComputer3.getVolumeLevel());
        officeComputer3.volumeUp(50);
        System.out.println(officeComputer3.getVolumeLevel());

        officeComputer3.volumeDown(10);
        System.out.println(officeComputer3.getVolumeLevel());
        officeComputer3.volumeDown(100);
        System.out.println(officeComputer3.getVolumeLevel());

        Laptop laptop3 = new Laptop("Laptop 3", "Lenovo", 500, 128, 50);

        laptop3.playMusic();
        laptop3.pauseMusic();
        laptop3.stopMusic();

        laptop3.playVideo();
        laptop3.pauseVideo();
        laptop3.stopVideo();
    }
}
