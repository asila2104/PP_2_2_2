package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDAOImp;
import web.models.Car;

import java.util.List;

@Service
public class CarServiceImp implements CarService{

    private final CarDAOImp dao;

    public CarServiceImp(CarDAOImp dao) {
        this.dao = dao;
    }

    @Override
    public List<Car> showCars(int count) {
        return dao.showCars(count);
    }
}
