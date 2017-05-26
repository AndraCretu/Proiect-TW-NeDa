package com.nepal.earthquake.REST.NepalEarthquakeREST.Services.impl;

import com.nepal.earthquake.REST.NepalEarthquakeREST.Models.Damages;
import com.nepal.earthquake.REST.NepalEarthquakeREST.Services.DamagesService;
import com.nepal.earthquake.REST.NepalEarthquakeREST.Storage.DamagesDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Robert on 5/20/2017.
 */
@Service
public class DamagesServiceImpl implements DamagesService{

    @Autowired
    private DamagesDAO damagesDAO;



    @Override
    public void deleteById(int id) {

    }

    @Override
    public Damages add(Damages damages) {
        damagesDAO.add(damages);
        return damages;
    }


    @Override
    public void deleteByDevelopmentRegion(String developmentRegion) {
        List<Damages> result = damagesDAO.getByDevelopmentRegion(developmentRegion);
        for(Damages damages : result)
            damagesDAO.remove(damages);
    }

    @Override
    public void deleteByGeographicalRegion(String geographicalRegion) {
        List<Damages> result = damagesDAO.getByGeographicalRegion(geographicalRegion);

        for(Damages damages : result)
            damagesDAO.remove(damages);
    }

    @Override
    public List<Damages> getAll() {
        return damagesDAO.getAll();
    }

    @Override
    public List<Damages> getTotalHousesAffected() {
        return null;
    }

    @Override
    public List<Damages> getTotalHousesAffectedByDevelopmentRegion(String developmentRegion) {
        return null;
    }

    @Override
    public List<Damages> getTotalHousesAffectedByGeographicalRegion(String geographicalRegion) {
        return null;
    }

    @Override
    public List<Damages> getTotalHousesByDevelopmentRegion(String developmentRegion) {
        return null;
    }

    @Override
    public List<Damages> getTotalHousesByGeographicalRegion(String geographicalRegion) {
        return null;
    }

    @Override
    public List<Damages> getDeadMaleByRegion(String region) {
        return damagesDAO.getDeadMaleByRegion(region);
    }

    @Override
    public List<Damages> getDeadFemaleByRegion(String region) {
        return damagesDAO.getDeadFemaleByRegion(region);
    }

    @Override
    public List<Damages> getTotalPopulationByDistrict(String district) {
        return damagesDAO.getTotalPopulationByRegion();
    }

    @Override
    public List<Damages> getDeadMaleAndFemaleByRegion(String district) {
        List<Damages> totalDeaths = damagesDAO.getDeadFemaleByRegion(district);
        totalDeaths.addAll(damagesDAO.getDeadMaleByRegion(district));

        return totalDeaths;

    }

}
