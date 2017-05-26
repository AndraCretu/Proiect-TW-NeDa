package com.nepal.earthquake.REST.NepalEarthquakeREST.Services;

import com.nepal.earthquake.REST.NepalEarthquakeREST.Models.Damages;

import java.util.List;

/**
 * Created by Robert on 5/20/2017.
 */
public interface DamagesService {

    void deleteById(int id);

    Damages add(Damages damages);

    void deleteByGeographicalRegion(String geographicalRegion);

    void deleteByDevelopmentRegion(String geographicalRegion);

    void deleteByDistrict(String district);

    void deleteByZone(String zone);

    List<Damages> getAll();

    List<Damages> getTotalHousesAffected();

    List<Damages> getTotalHousesAffectedByDevelopmentRegion(String developmentRegion);

    List<Damages> getTotalHousesAffectedByGeographicalRegion(String geographicalRegion);

    List<Damages> getTotalHousesByDevelopmentRegion(String developmentRegion);

    List<Damages> getTotalHousesByGeographicalRegion(String geographicalRegion);

    List<Damages> getDeadMaleByRegion(String region);

    List<Damages> getDeadFemaleByRegion(String region);

    List<Damages> getTotalPopulationByDistrict(String district);

    List<Damages> getDeadMaleAndFemaleByRegion(String district);


    List<Damages> getByZone(String zone);

    List<Damages> getByDistrict(String district);

}
