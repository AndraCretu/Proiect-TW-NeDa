package com.nepal.earthquake.REST.NepalEarthquakeREST.Models;

import javax.persistence.*;

/**
 * Created by Robert on 5/20/2017.
 */
@Entity
@Table(name = "`Damages`")
public class Damages {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, name= "`ID`")
    private int id;

    @Column( length = 50, name = "`District`")
    private String district;

    @Column( length = 50, name = "`Zone`")
    private String zone;

    @Column( length = 50, name = "`Geographical_Region`")
    private String geographicalRegion;

    @Column( length = 50, name = "`Development_Region`")
    private String developmentRegion;

    @Column( length = 50, name = "`Causalities`")
    private String causalities;

    @Column( name = "`Number`")
    private int number;

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getGeographicalRegion() {
        return geographicalRegion;
    }

    public void setGeographicalRegion(String geographicalRegion) {
        this.geographicalRegion = geographicalRegion;
    }

    public String getDevelopmentRegion() {
        return developmentRegion;
    }

    public void setDevelopmentRegion(String developmentRegion) {
        this.developmentRegion = developmentRegion;
    }

    public String getCausualities() {
        return causalities;
    }

    public void setCausalities(String causalities) {
        this.causalities = causalities;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


}
