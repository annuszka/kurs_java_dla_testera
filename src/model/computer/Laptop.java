package model.computer;

public class Laptop extends Computer implements Music, Video{

    private int batteryLevel;

    public Laptop(String name, String type, int hdd, int ram, int batteryLevel) {
        super(name, type, hdd, ram);
        this.batteryLevel = batteryLevel;
    }

    @Override
    public void switchOn() {
        System.out.println("Checking battery level");
        if (batteryLevel > 0) {
            super.switchOn();
        } else {
            System.out.println("Battery level too low");
        }
    }

    @Override
    public void switchOff() {
        System.out.println("switch off PC: " + name);
        state = false;
    }

    public void setBatteryLevel(int newBatteryLevel) {
        this.batteryLevel = newBatteryLevel;
    }

    @Override
    public int volumeUp() {
        return volumeLevel += 5;
    }

    @Override
    public int volumeUp(int newVolumeLevel) {
        volumeLevel = volumeLevel + newVolumeLevel;
        if (volumeLevel >= 100) {
            volumeLevel = 100;
        }
        return volumeLevel;
    }

    @Override
    public int volumeDown() {
        volumeLevel -= 2;
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

    @Override
    public void playMusic() {
        System.out.println("PLAY MUSIC");
    }

    @Override
    public void pauseMusic() {
        System.out.println("PAUSE MUSIC");
    }

    @Override
    public void stopMusic() {
        System.out.println("STOP MUSIC");
    }
//multiple inheritance from interface  (default method from java 8) - need to say which method we want to use from which interface
    @Override
    public void sayHello() {
        Music.super.sayHello();
    }

    @Override
    public void playVideo() {
        System.out.println("PLAY Video");
    }

    @Override
    public void pauseVideo() {
        System.out.println("PAUSE Video");
    }

    @Override
    public void stopVideo() {
        System.out.println("STOP Video");
    }
}
