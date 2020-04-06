import java.util.List;

public class Main {

    public static void turnAllOff(List<RemoteControllable> devices) {
        devices.forEach(p->p.turnOff());
    }

    public static void main(String[] args) {

//        Light l = new Light("Porch Light");
//        l.turnOn();
//
//        Television t = new Television("Main TV");
//        t.reset();
//
//        System.out.println(t.getStatus());
//        System.out.println(t.getDetailedStatus());
//
//        RemoteControllable r = new Light("Backyard Light");
//        r.turnOff();

        List<RemoteControllable> devices = List.of (
                new Light("Pool Light"),
                new Light("Back Light"),
                new Television("Guest TV"),
                new Television("Pool TV")

        );
        turnAllOff(devices);

        System.out.println(RemoteControllable.getSystemStatus());
    }
}
