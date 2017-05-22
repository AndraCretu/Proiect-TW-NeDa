package com.nepal.earthquake.REST.NepalEarthquakeREST.Storage.impl;

import com.nepal.earthquake.REST.NepalEarthquakeREST.Models.Aftershocks;
import com.nepal.earthquake.REST.NepalEarthquakeREST.Storage.AftershocksDAO;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Robert on 5/20/2017.
 */
@Repository
public class JpaAftershocksDAO implements AftershocksDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void updateDistrictMagnitude(String districtName, int newMagnitude) {

    }

    @Override
    public void deleteDistrictRecord(String districtName) {

    }

    @Transactional
    @Override
    public Aftershocks addNewRecord(Aftershocks newRecord) {
        return null;
    }

    @Override
    public List<Aftershocks> getAll() {
        return null;
    }

    @Override
    public List<Aftershocks> getTop3ByMagnitude() {
        return null;
    }

    @Override
    public List<Aftershocks> getLast3ByMagnitude() {
        return null;
    }
}
