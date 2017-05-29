package com.nepal.earthquake.REST.NepalEarthquakeREST.Storage.impl;

import com.nepal.earthquake.REST.NepalEarthquakeREST.Models.Damages;
import com.nepal.earthquake.REST.NepalEarthquakeREST.Storage.DamagesDAO;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
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


    @Override
    public List<Damages> getAll() {
        TypedQuery<Damages> query = entityManager.createQuery(
                "select d from Damages d", Damages.class
        );

        return query.getResultList();
    }



    @Override
    public List<Damages> getByDevelopmentRegion(String developmentRegion) {
        TypedQuery<Damages> query = entityManager.createQuery(
                "select d from Damages d where  Development_Region like :developmentRegion",Damages.class)
                .setParameter("developmentRegion", developmentRegion);

        return query.getResultList();
    }

    @Override
    public List<Damages> getByGeographicalRegion(String geographicalRegion) {
        TypedQuery<Damages> query = entityManager.createQuery(
                "select d from Damages d where  Geographical_Region like :geographicalRegion",Damages.class)
                .setParameter("geographicalRegion", geographicalRegion);

        return query.getResultList();
    }



    @Override
    public Damages getById(int id) {
        TypedQuery<Damages> query = entityManager.createQuery(
                "select d from Damages d where ID = :id",Damages.class)
                .setParameter("id", id);

        return query.getSingleResult();
    }

    @Override
    public List<Object[]> getTotalHousesAffected() {
        TypedQuery<Object[]> query = entityManager.createQuery(
                "select d.district, d.number from Damages d where " +
                        "lower(Causalities) like '%house fully destroyed%'", Object[].class);
        return query.getResultList();

    }

    @Override
    public List<Damages> getTotalHousesAffectedByDevelopmentRegion(String developmentRegion) {
        TypedQuery<Damages> query = entityManager.createQuery(
                "select d from Damages d where lower(Causalities) like '%dead male%'" +
                        " and Development_Region like :developmentRegion", Damages.class)
                .setParameter("developmentRegion", developmentRegion);
        return query.getResultList();
    }

    @Override
    public List<Damages> getTotalHousesAffectedByGeographicalRegion(String geographicalRegion) {
        TypedQuery<Damages> query = entityManager.createQuery(
                "select d from Damages d where lower(Causalities) like '%house fully destroyed%'" +
                        " and Geographical_region like :geographicalRegion", Damages.class)
                .setParameter("geographicalRegion", geographicalRegion);
        return query.getResultList();
    }

    @Override
    public List<Damages> getTotalHousesByDevelopmentRegion(String developmentRegion) {
        TypedQuery<Damages> query = entityManager.createQuery(
                "select d from Damages d where lower(Causalities) like 'total no. of houses'" +
                        " and Development_Region like :developmentRegion", Damages.class)
                .setParameter("developmentRegion", developmentRegion);
        return query.getResultList();
    }

    @Override
    public List<Damages> getTotalHousesByGeographicalRegion(String geographicalRegion) {
        TypedQuery<Damages> query = entityManager.createQuery(
                "select d from Damages d where lower(Causalities) like 'total no. of houses'" +
                        " and Geographical_Region like :geographicalRegion", Damages.class)
                .setParameter("geographicalRegion", geographicalRegion);
        return query.getResultList();
    }

    @Override
    public List<Damages> getByDistrict(String district) {
        TypedQuery<Damages> query = entityManager.createQuery(
                "select d from Damages d where District like :district", Damages.class)
                .setParameter("district", district);
        return query.getResultList();
    }

    @Override
    public List<Damages> getByZone(String zone) {
        TypedQuery<Damages> query = entityManager.createQuery(
                "select d from Damages d where Zone like :zone", Damages.class)
                .setParameter("zone", zone);
        return query.getResultList();
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
    public List<Object[]> getDeadMaleByRegionOnly(String region) {
        TypedQuery<Object[]> query = entityManager.createQuery("SELECT d.district,(0 - d.number ) " +
                "from Damages d where d.developmentRegion like :region " +
                " and lower(d.causalities) like 'dead male'", Object[].class)
                .setParameter("region", region);
        return query.getResultList();
    }

    @Override
    public List<Object[]> getDeadFemaleByRegionOnly(String region) {
        TypedQuery<Object[]> query = entityManager.createQuery("SELECT d.district, d.number " +
                "from Damages d where d.developmentRegion like :region " +
                " and lower(d.causalities) like 'dead female'", Object[].class)
                .setParameter("region", region);
        return query.getResultList();
    }

    @Override
    public List<Object[]> getDeadMaleAndFemaleByRegion(String region) {
        /*TypedQuery<Object[]> query = entityManager.createQuery("SELECT d1.district, d1.number, (0 - d2.number)" +
                " from Damages as d1 left join Damages as d2 on d1.district = d2.district where " +
                "d1.developmentRegion like :region and lower(d1.causalities) like 'dead female'" +
                " and lower(d2.causalities) like 'dead male'", Object[].class);*/
        TypedQuery<Object[]> query = entityManager.createQuery("SELECT distinct d1.district, d1.number, (0 - d2.number) " +
                "from Damages d1, Damages d2 where d1.district = d2.district " +
                "and lower(d1.causalities) like 'dead female' and" +
                " lower(d2.causalities) like 'dead male' and " +
                "d1.developmentRegion = :region and d2.developmentRegion = :region", Object[].class)
                .setParameter("region", region);

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
    public List<Damages> getTotalPopulationByRegion(String developmentRegion) {
        TypedQuery<Damages> query = entityManager.createQuery(
                "select d from Damages d where Causalities like 'Total Population'" +
                        "and Zone like :region", Damages.class)
                .setParameter("region", developmentRegion);

        return query.getResultList();
    }




}
