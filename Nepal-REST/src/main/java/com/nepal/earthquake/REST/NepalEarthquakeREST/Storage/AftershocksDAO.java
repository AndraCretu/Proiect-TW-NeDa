package com.nepal.earthquake.REST.NepalEarthquakeREST.Storage;

import com.nepal.earthquake.REST.NepalEarthquakeREST.Models.Aftershocks;

import java.util.List;

/**
 * Created by Robert on 5/20/2017.
 */
public interface AftershocksDAO {
    void updateDistrictMagnitude(String districtName, int newMagnitude);

    void deleteDistrictRecord(String districtName);

    Aftershocks addNewRecord(Aftershocks newRecord);

    List<Aftershocks> getAll();

    List<Aftershocks> getTop3ByMagnitude();

    List<Aftershocks> getLast3ByMagnitude();

}
