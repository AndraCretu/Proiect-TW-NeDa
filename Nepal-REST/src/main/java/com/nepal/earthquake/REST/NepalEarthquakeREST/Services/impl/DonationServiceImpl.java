package com.nepal.earthquake.REST.NepalEarthquakeREST.Services.impl;

import com.nepal.earthquake.REST.NepalEarthquakeREST.Models.Donations;
import com.nepal.earthquake.REST.NepalEarthquakeREST.Services.DonationsService;
import com.nepal.earthquake.REST.NepalEarthquakeREST.Storage.DonationsDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Robert on 5/20/2017.
 */
@Service
public class DonationServiceImpl implements DonationsService{
    @Autowired
    private DonationsDAO donationsDAO;

    @Override
    public Donations addDonations(String fundation, String donor, int sum) {
        return null;
    }

    @Override
    public void removeDonationsByDonor(String donor) {
        List<Donations> results = donationsDAO.getDonationsByDonor(donor);

        for(Donations row : results){
            donationsDAO.remove(row);
        }

    }

    @Override
    public void removeDonationsByFundation(String fundation) {

    }

    @Override
    public List<Donations> getAllDonations() {
        return donationsDAO.getAllDonations();
    }

    @Override
    public List<Donations> getDonationsByFundation(String fundation, int limit) {

        fundation = "%" + fundation + "%";
        return donationsDAO.getDonationsByFundation(fundation, limit);
    }

    @Override
    public List<Donations> getTopDonations(int top) {
        return donationsDAO.getTopDonations(top);
    }

    @Override
    public List<Donations> getLastDonations(int last) {
        return donationsDAO.getLastDonations(last);
    }


}
