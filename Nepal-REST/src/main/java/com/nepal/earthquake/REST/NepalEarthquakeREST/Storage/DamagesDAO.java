package com.nepal.earthquake.REST.NepalEarthquakeREST.Storage;

import com.nepal.earthquake.REST.NepalEarthquakeREST.Models.Damages;

import java.util.List;

/**
 * Created by Robert on 5/20/2017.
 */
public interface DamagesDAO {

    void add(Damages damage);

    void remove(Damages damage);

    void update(Damages damage);

    List<Damages> getAll();

    List<Damages> getByDevelopmentRegion(String developmentRegion);

    List<Damages> getByGeographicalRegion(String geographicalRegion);

    Damages getById( int id);

    List<Object[]> getTotalHousesAffected();

    List<Damages> getTotalHousesAffectedByDevelopmentRegion(String developmentRegion);

    List<Damages> getTotalHousesAffectedByGeographicalRegion(String geographicalRegion);

    List<Damages> getTotalHousesByDevelopmentRegion(String developmentRegion);

    List<Damages> getTotalHousesByGeographicalRegion(String geographicalRegion);

    List<Damages> getByDistrict(String district);

    List<Damages> getByZone(String zone);

    List<Damages> getDeadMaleByRegion(String region);

    List<Object[]> getDeadMaleByRegionOnly(String region);

    List<Object[]> getDeadFemaleByRegionOnly(String region);

    List<Object[]> getDeadMaleAndFemaleByRegion(String region);

    List<Damages> getDeadFemaleByRegion(String region);

    List<Damages> getTotalPopulationByRegion(String region);



}
