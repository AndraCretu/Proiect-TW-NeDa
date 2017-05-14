package com.nepalearthquake.api.rest.Services.impl;

import com.nepalearthquake.api.rest.Models.DeathsAndInjured;
import com.nepalearthquake.api.rest.Services.DeathsAndInjuredService;
import com.nepalearthquake.api.rest.Storage.DeathsInjuredDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Robert on 5/14/2017.
 */

@Service
public class DeathsAndInjuredServiceImpl implements DeathsAndInjuredService{

    @Autowired
    private DeathsInjuredDAO casualtyCount;

    @Override
    public List<DeathsAndInjured> getAll() {
        return casualtyCount.getAll();
    }
}
