package model.computer;

public class PC extends Computer {

    private boolean isPowerSupply;

    public PC(String name, String type, int hdd, int ram) {
        super(name, type, hdd, ram);
        isPowerSupply = false;
    }

    public void setPowerSupply(boolean powerSupply) {
        isPowerSupply = powerSupply;
    }

    @Override
    public int volumeUp() {
        return volumeLevel += 1;
    }

    @Override
    public int volumeDown() {
        volumeLevel -=1;
        return volumeLevel <=0 ? 0 : volumeLevel;
    }

    public void showCompterName() {
        System.out.println(name);
    }

    @Override
    public void switchOn() {
        System.out.println("Checking power supply");
        if (isPowerSupply) {
            super.switchOn();
        } else {
            System.out.println("Power supply is missing");
        }
    }
}
