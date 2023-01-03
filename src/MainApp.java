import model.computer.Computer;
import model.computer.Laptop;
import model.computer.PC;

public class MainApp {
    public static void main(String[] args) {
    //polimorfizm - do jednego typu referencji przypisane rozne formy obiektu, po lewe klasa najwyzej w hierarchii, po prawej klasy po niej dziedziczace
        Computer officeComputer = new PC("Office computer 1", "HP", 500,128);
        Computer officeComputer2 = new PC("Office computer 2", "HP", 500,128);
        Computer officeComputer3 = new PC("Office computer 3", "HP", 500,128);
        Computer laptop = new Laptop("Laptop", "Lenovo", 500,128, 50);
        Computer laptop2 = new Laptop("Laptop 2", "Lenovo", 500,128, 50);

        Computer[] computers = {officeComputer, officeComputer2, officeComputer3, laptop, laptop2};

        for (Computer computer : computers) {
            computer.switchOff();
        }
    }
}
