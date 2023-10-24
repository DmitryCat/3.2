import Service.ServiceStation;
import Transport.Bicycle;

public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("Колесо", 2);
        Bicycle bicycle12 = new Bicycle("Колеса", 3);
        bicycle12.check();
        ServiceStation serviceStation = new ServiceStation();
        serviceStation.check(bicycle12);
    }
}