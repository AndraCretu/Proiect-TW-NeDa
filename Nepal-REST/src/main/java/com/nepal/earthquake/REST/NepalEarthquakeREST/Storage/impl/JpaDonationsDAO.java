package com.nepal.earthquake.REST.NepalEarthquakeREST.Storage.impl;

import com.nepal.earthquake.REST.NepalEarthquakeREST.Models.Donations;
import com.nepal.earthquake.REST.NepalEarthquakeREST.Storage.DonationsDAO;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by Robert on 5/20/2017.
 */
@Repository
public class JpaDonationsDAO implements DonationsDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Donations addDonations(String fundation, String donor, int sum) {
        return null;
    }

    @Override
    public void removeDonationsByDonor(String donor) {

    }

    @Override
    public void removeDonationsByFundation(String fundation) {

    }

    @Override
    public List<Donations> getAllDonations() {
        TypedQuery<Donations> query = entityManager.createQuery("select d from Donations d", Donations.class);
        return query.getResultList();
    }

    @Override
    public List<Donations> getDonationsByFundation(String fundation, int limit) {
        TypedQuery<Donations> query = entityManager.createQuery("select d from Donations d where Donation_Type like :fundation " +
                "order by Net_donation desc", Donations.class)
                .setParameter("fundation", fundation);
        if(limit > 0)
            query.setMaxResults(limit);
        return query.getResultList();
    }

    @Override
    public List<Donations> getTopDonations(int top) {

        TypedQuery<Donations> query = entityManager.createQuery(
                "select d from Donations d order by Net_donation desc", Donations.class);

        query.setMaxResults(top);
        return query.getResultList();
    }

    @Override
    public List<Donations> getLastDonations(int last) {
        TypedQuery<Donations> query = entityManager.createQuery(
                "select d from Donations d order by Net_donations desc", Donations.class);
        query.setMaxResults(last);
        return query.getResultList();
    }
}
