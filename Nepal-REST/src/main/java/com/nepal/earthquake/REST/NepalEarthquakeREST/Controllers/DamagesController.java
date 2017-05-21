package com.nepal.earthquake.REST.NepalEarthquakeREST.Controllers;

import com.nepal.earthquake.REST.NepalEarthquakeREST.Models.Damages;
import com.nepal.earthquake.REST.NepalEarthquakeREST.Services.DamagesService;
import com.nepal.earthquake.REST.NepalEarthquakeREST.Storage.DamagesDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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

    @RequestMapping(value = "/deadMale/{region}", method = RequestMethod.GET)
    public List<Damages> getDeadMaleByRegion(@PathVariable String region){
        return damagesService.getDeadMaleByRegion(region);
    }

    @RequestMapping(value = "/deadFemale/{region}", method = RequestMethod.GET)
    public List<Damages> getDeadFemaleByRegion(@PathVariable String region){
        return damagesService.getDeadFemaleByRegion(region);
    }

    @RequestMapping(value = "/totalDeaths/{region}", method = RequestMethod.GET)
    public List<Damages> getDeadFemaleAndMaleByRegion(@PathVariable String region){
        return damagesService.getDeadMaleAndFemaleByRegion(region);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Damages> getAll(){
        return damagesService.getAll();
    }

    /*@RequestMapping(value = "/population", method = RequestMethod.GET)
    public List<Damages> getTotalPopulation(){
        return damagesService.getTotalPopulationByDistrict();
    }*/

}
