package com.nepal.earthquake.REST.NepalEarthquakeREST.Controllers;

import com.nepal.earthquake.REST.NepalEarthquakeREST.Models.Damages;
import com.nepal.earthquake.REST.NepalEarthquakeREST.Services.DamagesService;
import com.nepal.earthquake.REST.NepalEarthquakeREST.Storage.DamagesDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Robert on 5/20/2017.
 */
@RestController
@RequestMapping("/damages")
public class DamagesController {

    @Autowired
    private DamagesDAO damagesDAO;

    @Autowired
    private DamagesService damagesService;

    //TODO response body for delete/add

    @RequestMapping(value = "/delete/developmentRegion/{developmentRegion}", method = RequestMethod.DELETE)
    public void removeByDevelopmentRegion(@PathVariable String developmentRegion){
        damagesService.deleteByDevelopmentRegion(developmentRegion);
    }

    @RequestMapping(value = "/delete/geographicalRegion/{geographicalRegion}", method = RequestMethod.DELETE)
    public void removeByGeographicalRegion(@PathVariable String geographicalRegion){
        damagesService.deleteByGeographicalRegion(geographicalRegion);
    }

    @RequestMapping(value = "/delete/id/{id}", method = RequestMethod.DELETE)
    public void removeById(@PathVariable int id){
        damagesService.deleteById(id);
    }

    @RequestMapping(value = "/delete/zone/{zone}", method = RequestMethod.DELETE)
    public void removeByZone(@PathVariable String zone){
        damagesService.deleteByZone(zone);
    }

    @RequestMapping(value = "/delete/district/{district}", method = RequestMethod.DELETE)
    public void removeByDistrict(@PathVariable String district){
        damagesService.deleteByDistrict(district);
    }


    @RequestMapping(value = "/update/district/{districtName}",method = RequestMethod.PATCH)
    public void update(@PathVariable String district){
        damagesService.update(district);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Damages add(@RequestBody Damages damages){
        return damagesService.add(damages);
    }



    @RequestMapping(value = "/developmentRegion/{developmentRegion}", method = RequestMethod.GET)
    public List<Damages> getByDevelopmentRegion(@PathVariable String developmentRegion){
        return damagesDAO.getByDevelopmentRegion(developmentRegion);
    }

    @RequestMapping(value = "/geographicalRegion/{geographicalRegion}", method = RequestMethod.GET)
    public List<Damages> getByGeographicalRegion(@PathVariable String geographicalRegion){
        return damagesDAO.getByGeographicalRegion(geographicalRegion);
    }

    @RequestMapping(value = "/deadMale/{region}", method = RequestMethod.GET)
    public List<Damages> getDeadMaleByRegion(@PathVariable String region){
        return damagesService.getDeadMaleByRegion(region);
    }

    @RequestMapping(value = "/deadMale/only/{region}", method = RequestMethod.GET)
    public List<Object[]> getDeadMaleByRegionOnly(@PathVariable String region){
        return damagesService.getDeadMaleByRegionOnly(region);
    }

    @RequestMapping(value = "/deadFemale/only/{region}", method = RequestMethod.GET)
    public List<Object[]> getDeadFemaleByRegionOnly(@PathVariable String region){
        return damagesService.getDeadFemaleByRegionOnly(region);
    }

    @RequestMapping(value = "/deadFemale/{region}", method = RequestMethod.GET)
    public List<Damages> getDeadFemaleByRegion(@PathVariable String region){
        return damagesService.getDeadFemaleByRegion(region);
    }

    @RequestMapping(value = "/deadMaleFemale/{region}", method = RequestMethod.GET)
    public List<Object[]> getDeadMaleAndFemaleByRegionOnly(@PathVariable String region){
        return damagesService.getDeadMaleAndFemaleByRegionOnly(region);
    }

    @RequestMapping(value = "/totalDeaths/{region}", method = RequestMethod.GET)
    public List<Damages> getDeadFemaleAndMaleByRegion(@PathVariable String region){
        return damagesService.getDeadMaleAndFemaleByRegion(region);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Damages> getAll(){
        return damagesService.getAll();
    }

    @RequestMapping(value = "/totalHouses/geoReg/{geographicalRegion}", method = RequestMethod.GET)
    public List<Damages> getTotalHousesByGeographicalRegion(@PathVariable String geographicalRegion){
        return damagesService.getTotalHousesByGeographicalRegion(geographicalRegion);
    }

    @RequestMapping(value = "/totalHouses/zone/{zone}", method = RequestMethod.GET)
    public List<Damages> getTotalHousesByDevelopmentRegion(@PathVariable("zone") String developmentRegion){
        return damagesService.getTotalHousesByDevelopmentRegion(developmentRegion);
    }


    @RequestMapping(value = "/destroyedHouses/geographical/{geographicalRegion}", method = RequestMethod.GET)
    public List<Damages> getTotalHouseAffectedByGeoRegion(@PathVariable String geographicalRegion){
        return damagesService.getTotalHousesAffectedByGeographicalRegion(geographicalRegion);
    }

    @RequestMapping(value = "/destroyedHouses/region/{developmentRegion}", method = RequestMethod.GET)
    public List<Damages> getTotalHousesAffectByDevRegn(@PathVariable String developmentRegion) {
        return damagesService.getTotalHousesAffectedByDevelopmentRegion(developmentRegion);
    }

    @RequestMapping(value = "/destroyedHouses", method = RequestMethod.GET)
    public List<Object[]> getTotalHousesAffected(){
        return damagesService.getTotalHousesAffected();
    }

    @RequestMapping(value = "/zone/{zone}", method = RequestMethod.GET)
    public List<Damages> getByZone(@PathVariable String zone){
        return damagesService.getByZone(zone);
    }

    @RequestMapping(value = "/district/{district}", method = RequestMethod.GET)
    public List<Damages> getByDistrict(@PathVariable String district){
        return damagesService.getByDistrict(district);
    }

}
