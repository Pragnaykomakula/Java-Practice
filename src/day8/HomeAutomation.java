package day8;

public class HomeAutomation {
    public static void main(String[] args) {
        SmartBulb sb = new SmartBulb();
        SmartFan sf = new SmartFan();
        sb.turnOn();
        sb.turnOff();

        System.out.println("--------------------");

        sf.turnOn();
        sf.turnOff();
    }
}
interface SmartDevice{
    abstract void turnOn();
    abstract void turnOff();
}

class SmartBulb implements SmartDevice{
    public void turnOn(){
        System.out.println("SmartBulb: Glowing at 100% brightness.");
    }
    public void turnOff(){
        System.out.println("SmartBulb: Darkness.");
    }
}

class SmartFan implements SmartDevice{
    public void turnOn(){
        System.out.println("SmartFan: Spinning at max speed.");
    }
    public void turnOff(){
        System.out.println("SmartFan: Stopping rotation.");
    }
}

