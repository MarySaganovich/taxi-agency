import com.taxiagency.dao.*;
import com.taxiagency.domain.*;

import java.io.*;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Dao<Car> car1 = new CarRamDao();

        for (int i = 0; i < 10; i++) {
            String id = String.valueOf(i + 1);
            Car car = new Car(id, Color.wishColor(), "");
            car.setCarsNumber();
            car1.save(car);
        }

        List<Car> allCars = car1.findAll();
        System.out.println(allCars);

        Dao<Driver> drivers = new DriverRamDao();

        for (int i = 0; i < 10; i++) {
            String id = String.valueOf(i + 1);
            Driver driver = new Driver(id, DriversName.wishName());
            drivers.save(driver);
        }
        List<Driver> allDrivers = drivers.findAll();
        System.out.println(allDrivers);

        String carsDir = "D:\\saganovichm\\taxiagency\\cars";
        String fileCars = "\\cars.txt";
        CarFileDao d = new CarFileDao();
        d.createFile(carsDir, fileCars, allDrivers);

        String driversDir = "D:\\saganovichm\\taxiagency\\drivers";
        String fileDriversName = "\\drivers.txt";
        DriverFileDao n = new DriverFileDao();
        n.createFile(driversDir, fileDriversName, allDrivers);


    }

}








