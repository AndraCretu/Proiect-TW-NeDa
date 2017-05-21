package com.nepal.earthquake.REST.NepalEarthquakeREST.Services.impl;

import com.nepal.earthquake.REST.NepalEarthquakeREST.Models.Aftershocks;
import com.nepal.earthquake.REST.NepalEarthquakeREST.Services.AftershocksService;

import java.util.List;

/**
 * Created by Robert on 5/20/2017.
 */
public class AftershocksServiceImpl implements AftershocksService {
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

    @Override
    public void updateDistrictMagnitude(String districtName, int newMagnitude) {

    }

    @Override
    public void deleteDistrictRecord(String districtName) {

    }

    @Override
    public Aftershocks addNewRecord(Aftershocks newRecord) {
        return null;
    }
}
