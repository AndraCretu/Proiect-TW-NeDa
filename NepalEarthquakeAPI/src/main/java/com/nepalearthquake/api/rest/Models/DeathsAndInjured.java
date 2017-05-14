package com.nepalearthquake.api.rest.Models;

import javax.persistence.*;

/**
 * Created by Robert on 5/14/2017.
 */
@Entity
@Table(name="deaths-and-injured")
public class DeathsAndInjured {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, nullable = false, name = "ID")
    private int id;

    @Column(nullable = false, name = "Dsitrict_name")
    private String districtName;

    @Column(nullable = false, name = "Number of Deaths")
    private int deathsCount;

    @Column(nullable = false, name = "Number of injured")
    private int injuredCount;

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public int getDeathsCount() {
        return deathsCount;
    }

    public void setDeathsCount(int deathsCount) {
        this.deathsCount = deathsCount;
    }

    public int getInjuredCount() {

        return injuredCount;
    }

    public void setInjuredCount(int injuredCount) {
        this.injuredCount = injuredCount;
    }
}
