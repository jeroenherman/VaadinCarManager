package be.leerstad.carfleet.service.manager;


import be.leerstad.carfleet.repository.ICarRepository;
import be.leerstad.carfleet.service.dto.BrandDTO;


import java.util.Collection;
import java.util.Observable;


public class CarManager extends Observable {
    private ICarRepository carRepository;
    public Collection<BrandDTO> getBrands() {

        return ;
    }

    // CarDummyRepository repo;

}
