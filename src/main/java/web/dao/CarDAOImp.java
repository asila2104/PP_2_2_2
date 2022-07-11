package web.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAOImp implements CarDAO {
    private List<Car> cars;
    private int CARS_COUNT;

    {
        cars = new ArrayList<>();

        cars.add(new Car(++CARS_COUNT, "Renault", "Red"));
        cars.add(new Car(++CARS_COUNT, "Ford", "Blue"));
        cars.add(new Car(++CARS_COUNT, "Lada", "Black"));
        cars.add(new Car(++CARS_COUNT, "Lada", "White"));
        cars.add(new Car(++CARS_COUNT, "Toyota", "Red"));
    }

    @Override
    public List<Car> showCars(int count) {
        return cars.stream().limit(count).toList();
    }
}
