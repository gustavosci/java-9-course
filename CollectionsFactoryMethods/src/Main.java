import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        // List
        final List<String> cars = List.of("Gol", "Palio", "Punto");
        // cars.add("Fiat 147"); // a exception will be throw because that list is unmodifiable
        cars.stream().forEach(System.out::println);

        // List
        final Set<String> carsSet = Set.of("Gol", "Palio", "Punto");
        carsSet.stream().forEach(System.out::println);

        // it works for maps as well (Map.of)
    }
}
