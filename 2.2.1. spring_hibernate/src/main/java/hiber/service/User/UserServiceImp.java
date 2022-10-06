package hiber.service.User;

import hiber.dao.Car.CarDao;
import hiber.dao.User.UserDao;
import hiber.model.Car;
import hiber.model.User;
import hiber.service.Car.CarService;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

   @Autowired
   private UserDao userDao;

   @Transactional
   @Override
   public void add(User user) {
      userDao.add(user);
   }

   @Transactional(readOnly = true)
   @Override
   public List<User> listUsers() {
      return userDao.listUsers();
   }
   @Transactional(readOnly = true)
   @Override
   public  User findUserByCar(String model, int series) {
      return userDao.findUserByCar(model, series);
   }

}
