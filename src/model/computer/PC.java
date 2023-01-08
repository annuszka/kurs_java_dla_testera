package model.computer;

public class PC extends Computer {

    private boolean isPowerSupply;

    public PC(String name, String type, Hdd hdd, Ram ram) {
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
    public int volumeUp(int newVolumeLevel) {
//        volumeLevel = volumeLevel + newVolumeLevel;
//        if (volumeLevel >= 100) {
//            volumeLevel = 100;
//        }
//        return volumeLevel;
        throw  new UnsupportedOperationException("This method is not supported for PC");
    }

    @Override
    public int volumeDown() {
        volumeLevel -= 1;
        return volumeLevel <= 0 ? 0 : volumeLevel;
    }

    @Override
    public int volumeDown(int newVolumeLevel) {
        volumeLevel = volumeLevel - newVolumeLevel;
        if (volumeLevel <= 0) {
            volumeLevel = 0;
        }
        return volumeLevel;
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
