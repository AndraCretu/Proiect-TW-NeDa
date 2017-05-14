package com.nepalearthquake.api.rest.Services;

import com.nepalearthquake.api.rest.Models.DeathsAndInjured;

import java.util.List;

/**
 * Created by Robert on 5/14/2017.
 */
public interface DeathsAndInjuredService {

    public List<DeathsAndInjured> getAll();
}
