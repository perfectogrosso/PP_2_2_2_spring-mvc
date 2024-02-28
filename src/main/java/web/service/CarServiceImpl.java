package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarServiceImpl implements CarService{

    private static Long ID = 0L;
    private static List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car(++ID,"Black",120));
        cars.add(new Car(++ID,"White",110));
        cars.add(new Car(++ID,"Red",240));
        cars.add(new Car(++ID,"Blue",74));
        cars.add(new Car(++ID,"Yellow",210));
    }
    public List<Car> returnCars(Integer count){
        if(count >= 5){
            return cars;
        }
        List<Car> list = new ArrayList<>();
        int counter = 0;
        for(; count > 0; count--){
            list.add(cars.get(counter++));
        }
        return list;
    }
}
