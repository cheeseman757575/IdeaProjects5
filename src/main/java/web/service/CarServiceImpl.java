package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final List<Car> carList;

    public CarServiceImpl() {
        carList = new ArrayList<>();
        carList.add(new Car("Toyota", "Camry", "20-22-33-44"));
        carList.add(new Car("BMW", "E46", "10-12-13-14"));
        carList.add(new Car("MB", "AMG", "30-77-77-88"));
        carList.add(new Car("AUDI", "A7", "21-31-41-51"));
        carList.add(new Car("HONDA", "Accord", "99-99-99-11"));

    }

    @Override
    public List<Car> getCar(int count) {

            if (count >= carList.size()){
                return carList;
        } else {
                return carList.subList(0,count);
        }

    }
}
