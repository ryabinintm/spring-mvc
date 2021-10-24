package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {

    private static final List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car("Toyota", 1980, "black"));
        cars.add(new Car("Honda", 1975, "white"));
        cars.add(new Car("Mitsubishi", 1988, "green"));
        cars.add(new Car("Ford", 1990, "red"));
        cars.add(new Car("VW", 1079, "yellow"));
    };

    @Override
    public List<Car> getCars(int count) {
        if (count == 0) {
            return cars;
        }
        return cars.stream()
                .limit(count)
                .collect(Collectors.toList());
    }


}
