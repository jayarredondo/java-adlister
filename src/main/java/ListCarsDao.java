import java.util.ArrayList;
import java.util.List;

public class ListCarsDao implements Cars{
    private List<Car> cars;
    @Override
    public List<Car> callingAllCars(){

        if(cars == null){
            cars = generateCars();
        }
        return cars;
    }

    private List<Car> generateCars(){
        List<Car> cars = new ArrayList<>();

        cars.add(new Car(1, "Kia", "Forte", 2012));
        cars.add(new Car(2, "Toyota", "Camry", 2016));
        cars.add(new Car(3, "Jeep", "Grand Cherokee", 2019));
        cars.add(new Car(4, "Ford", "Escape", 2018));

        return cars;
    }
}
