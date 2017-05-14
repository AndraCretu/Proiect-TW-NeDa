package com.nepalearthquake.api.rest.Storage.impl;

import com.nepalearthquake.api.rest.Models.DeathsAndInjured;
import com.nepalearthquake.api.rest.Storage.DeathsInjuredDAO;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by Robert on 5/14/2017.
 */
@Repository
public class JpaDeathsInjuredDAO implements DeathsInjuredDAO {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<DeathsAndInjured> getAll() {
        TypedQuery<DeathsAndInjured> query = entityManager.createQuery("select d from DeathsAndInjured d", DeathsAndInjured.class);
        return query.getResultList();
    }
}
