package be.leerstad.carfleet.repository.impl;

import be.leerstad.carfleet.business.Car;
import be.leerstad.carfleet.repository.ICarRepository;

import java.util.List;

public class DummyCarRepo implements ICarRepository {
    private List<Car> cars;
    @Override
    public List<Car> getAll() {
        return cars;
    }

    @Override
    public boolean add(Car car) {
        cars.add(car);
        return cars.contains(car);
    }

    @Override
    public boolean remove(Car car) {
        cars.remove(car);
        return !(cars.contains(car));
    }

    @Override
    public Car getByID(int i) {
        return cars.get(i);
    }
}

