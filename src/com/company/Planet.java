package com.company;

/**
 * Created by idejesus on 06/04/2017.
 */
public class Planet extends HeavenlyBody implements SatelitteAdd{
    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.PLANET);
    }

    @Override
    public boolean addSatellite(HeavenlyBody satellite) {
        if (satellite.getBodyType() == BodyTypes.MOON) {
            return satellites.add(satellite);
        } else {
            return false;
        }
    }
}
