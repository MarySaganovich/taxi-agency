package com.taxiagency.dao;

import com.taxiagency.domain.Car;
import com.taxiagency.domain.Color;

import java.util.*;

public class CarRamDao extends RamDao implements CarDao {
    @Override
    public Car findByNumber(String carsNumber) {
        return null;
    }

    @Override
    public List<Car> findByColor(Color carsColor) {
        return null;
    }

}
