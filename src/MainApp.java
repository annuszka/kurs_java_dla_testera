import model.computer.Laptop;
import model.computer.PC;

public class MainApp {
    public static void main(String[] args) {

        PC officeComputer = new PC("Office computer", "HP", 500,128);
        Laptop laptop = new Laptop("Laptop", "Lenovo", 500,128);

        officeComputer.showCompterName();

        officeComputer.switchOn();
        laptop.switchOn();
    }
}
