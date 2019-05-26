package com.taxiagency.dao;

import com.taxiagency.domain.Car;
import com.taxiagency.domain.Color;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class CarFileDao extends FileDao implements CarDao {

    @Override
    public Car findByNumber(String carsNumber) {

        return null;
    }

    @Override
    public List<Car> findByColor(Color carsColor) {
        return null;
    }


}

