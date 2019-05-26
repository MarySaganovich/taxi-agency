package com.taxiagency.dao;

import com.taxiagency.domain.Driver;
import com.taxiagency.domain.Entity;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class DriverFileDao extends FileDao implements DriverDao {

    @Override
    public List<Driver> findByName(String driversName) {
        return null;
    }


    //    public void driversfile(String fileName, List<Driver> allDrivers){
//        String dir1 = "D:\\saganovichm\\taxiagency\\drivers";
//        File pathDrivers = new File(dir1);
//        boolean created1 = pathDrivers.mkdirs();
//        if (created1) {
//            File fileDriver = new File(dir1 + fileName);
//            try {
//                if (!fileDriver.exists()) {
//                    fileDriver.createNewFile();
//                }
//            } catch (IOException e4) {
//                e4.printStackTrace();
//            }
//
//            try (FileWriter fwDriver = new FileWriter(fileDriver);
//                 BufferedWriter bwDriver = new BufferedWriter(fwDriver)) {
//                bwDriver.write(allDrivers.toString());
//
//            } catch (IOException e5) {
//                e5.printStackTrace();
//            }
//        }
//    }
}
