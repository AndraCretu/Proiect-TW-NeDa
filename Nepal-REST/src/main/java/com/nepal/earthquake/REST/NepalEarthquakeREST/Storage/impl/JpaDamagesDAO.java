package com.nepal.earthquake.REST.NepalEarthquakeREST.Storage.impl;

import com.nepal.earthquake.REST.NepalEarthquakeREST.Models.Damages;
import com.nepal.earthquake.REST.NepalEarthquakeREST.Storage.DamagesDAO;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Robert on 5/20/2017.
 */
@Repository
public class JpaDamagesDAO implements DamagesDAO {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Damages> getAll() {
        TypedQuery<Damages> query = entityManager.createQuery(
                "select d from Damages d", Damages.class
        );

        return query.getResultList();
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
        TypedQuery<Damages> query = entityManager.createQuery(
                "select d from Damages d where lower(Causalities) like '%dead male%'" +
                        " and Development_Region like :district", Damages.class)
                .setParameter("district", region);
        return query.getResultList();

    }

    @Override
    public List<Damages> getDeadFemaleByRegion(String region) {

        TypedQuery<Damages> query = entityManager.createQuery(
                "select d from Damages d where lower(Causalities) like '%dead female%' " +
                        "and Development_Region like :district", Damages.class)
                .setParameter("district", region);
        return query.getResultList();

    }

    @Override
    public List<Damages> getTotalPopulationByRegion() {
        TypedQuery<Damages> query = entityManager.createQuery(
                "select d from Damages d where Causalities like 'Total Population'", Damages.class
        );

        return query.getResultList();
    }


    @Override
    public void deleteByDevelopmentRegion(String developmentRegion) {

    }

    @Override
    public void deleteByGeographicalRegion(String geographicalRegion) {

    }

    @Transactional
    @Override
    public void add(Damages damage) {
        entityManager.persist(damage);
    }

    @Transactional
    @Override
    public void remove(Damages damage) {
        entityManager.remove(damage);
    }

    @Transactional
    @Override
    public void update(Damages damage) {
        entityManager.merge(damage);
    }
}