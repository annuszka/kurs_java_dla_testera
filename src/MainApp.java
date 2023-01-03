import model.Bug;
import model.User;
import model.computer.PC;

public class MainApp {
    public static void main(String[] args) {

        PC officeComputer = new PC("Office computer", "HP", 500,128);
        PC laptop = new PC("Laptop", "Lenovo", 500,128);

        officeComputer.switchOn();
        System.out.println(officeComputer.getState());
    }
}
