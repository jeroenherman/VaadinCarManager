package be.leerstad.carfleet.repository;

import be.leerstad.carfleet.business.Car;
import service.repository.IRepository;

import java.util.List;

public interface ICarRepository  extends IRepository<Car> {
    public List<Car> getAll();

}
