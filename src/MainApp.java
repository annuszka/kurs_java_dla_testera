import model.computer.Laptop;
import model.computer.PC;

public class MainApp {
    public static void main(String[] args) {

        PC officeComputer = new PC("Office computer", "HP", 500,128);
        Laptop laptop = new Laptop("Laptop", "Lenovo", 500,128, 50);

        officeComputer.showCompterName();
        officeComputer.switchOn();
        System.out.println(officeComputer.getState());
        officeComputer.setPowerSupply(true);
        officeComputer.switchOn();
        System.out.println(officeComputer.getState());

        laptop.setBatteryLevel(0);
        laptop.switchOn();
        System.out.println(laptop.getState());
    }
}
