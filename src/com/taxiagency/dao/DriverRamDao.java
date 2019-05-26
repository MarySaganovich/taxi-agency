package com.taxiagency.dao;

import com.taxiagency.domain.Driver;
import com.taxiagency.domain.Entity;

import java.util.List;

public class DriverRamDao extends RamDao implements DriverDao {
    @Override
    public List<Driver> findByName(String driversName) {
        return null;
    }


    @Override
    public Entity findById(String id) {
        return null;
    }

}
