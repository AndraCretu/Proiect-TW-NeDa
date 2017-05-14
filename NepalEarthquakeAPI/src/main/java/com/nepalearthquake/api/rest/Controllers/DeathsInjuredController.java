package com.nepalearthquake.api.rest.Controllers;

import com.nepalearthquake.api.rest.Models.DeathsAndInjured;
import com.nepalearthquake.api.rest.Services.DeathsAndInjuredService;
import com.nepalearthquake.api.rest.Services.impl.DeathsAndInjuredServiceImpl;
import com.nepalearthquake.api.rest.Storage.DeathsInjuredDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * Created by Robert on 5/14/2017.
 */
@RestController
@RequestMapping("/getDeathsInjured")
public class DeathsInjuredController {
    @Autowired
    private DeathsAndInjuredService casualtyService;

    @Autowired
    private DeathsInjuredDAO casualtyCount;

    @RequestMapping(name = "", method = RequestMethod.GET)
    public List<DeathsAndInjured> getCasualty(@RequestParam(required = false) Map<String, String> q){
        return casualtyService.getAll();

    }
}
