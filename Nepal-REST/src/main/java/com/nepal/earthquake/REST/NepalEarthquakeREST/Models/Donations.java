package com.nepal.earthquake.REST.NepalEarthquakeREST.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by Robert on 5/20/2017.
 */
@Entity
@Table(name = "`Donations`")
public class Donations {

    @Id
    @Column(unique = true, nullable = false, name = "`ID`")
    private int ID;

    @Column( nullable = false, name = "`Data`")
    private String date;

    @Column(length = 50, nullable = false, name = "`Donation_type`")
    private String donationType;

    @Column( length = 50, nullable = false, name = "`Donor`")
    private String donor;

    @Column( length = 50, nullable = false, name = "`Net_donation`")
    private int netDonation;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getData() {
        return date;
    }

    public void setData(String data) {
        this.date = data;
    }

    public String getDonationType() {
        return donationType;
    }

    public void setDonationType(String donationType) {
        this.donationType = donationType;
    }

    public String getDonor() {
        return donor;
    }

    public void setDonor(String donor) {
        this.donor = donor;
    }

    public int getNetDonation() {
        return netDonation;
    }

    public void setNetDonation(int netDonation) {
        this.netDonation = netDonation;
    }
}
