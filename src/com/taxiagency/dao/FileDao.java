package com.taxiagency.dao;

import com.taxiagency.domain.Driver;
import com.taxiagency.domain.Entity;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileDao<B> implements Dao {
    @Override
    public String save(Entity obj) {
        return null;
    }

    @Override
    public void update(Entity obj) {

    }

    @Override
    public void upsert(Entity obj) {

    }

    @Override
    public void delete(Entity obj) {

    }

    @Override
    public Entity findById(String id) {
        return null;
    }

    @Override
    public List findAll() {
        return null;
    }

    public void createFile(String dir, String fileName, List<B> list){
        File pathDrivers = new File(dir);
        boolean created1 = pathDrivers.mkdirs();
        if (created1) {
            File fileDriver = new File(dir + fileName);
            try {
                if (!fileDriver.exists()) {
                    fileDriver.createNewFile();
                }
            } catch (IOException e4) {
                e4.printStackTrace();
            }

            try (FileWriter fwDriver = new FileWriter(fileDriver);
                 BufferedWriter bwDriver = new BufferedWriter(fwDriver)) {
                bwDriver.write(list.toString());

            } catch (IOException e5) {
                e5.printStackTrace();
            }
        }
    }
}
