package com.nepal.earthquake.REST.NepalEarthquakeREST.Storage;

import com.nepal.earthquake.REST.NepalEarthquakeREST.Models.Damages;

import java.util.List;

/**
 * Created by Robert on 5/20/2017.
 */
public interface DamagesDAO {
    List<Damages> getAll();

    List<Damages> getTotalHousesAffected();

    List<Damages> getTotalHousesAffectedByDevelopmentRegion(String developmentRegion);

    List<Damages> getTotalHousesAffectedByGeographicalRegion(String geographicalRegion);

    List<Damages> getTotalHousesByDevelopmentRegion(String developmentRegion);

    List<Damages> getTotalHousesByGeographicalRegion(String geographicalRegion);

    List<Damages> getDeadMaleByRegion(String region);

    List<Damages> getDeadFemaleByRegion(String region);

    List<Damages> getTotalPopulationByRegion();

    void deleteByDevelopmentRegion(String developmentRegion);

    void deleteByGeographicalRegion(String geographicalRegion);

    void add(Damages damage);

    void remove(Damages damage);

    void update(Damages damage);
}
