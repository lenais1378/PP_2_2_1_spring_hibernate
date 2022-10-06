package hiber.service.Car;


import hiber.dao.Car.CarDao;
import hiber.dao.User.UserDao;
import hiber.model.Car;
import hiber.model.User;
import hiber.service.Car.CarService;
import hiber.service.User.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CarServiceImp implements CarService {

    @Autowired
    private CarDao carDao;

    @Transactional
    @Override
    public void addCar(Car car) {
        carDao.addCar(car);
    }
//    @Transactional
//    @Override
//    public void addUserAndCar(User user, Car car) {
//        userDao.add(user);
//        carDao.addCar(car);
//    }

    @Transactional(readOnly = true)
    @Override
    public List<Car> listCars() {
        return carDao.listCars();
    }
}
