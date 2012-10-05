package com.meriman.gtrd;

/**
 * User: Mentor <debiboon@gmail.com>
 * Date: 05.10.12
 * Time: 14:02
 */
public class Entity implements Visible{
    private Coord coords;

    private int cloaking = 0;
    private double visionDistance = 0;

    public Entity(Coord c) {
        coords = c;
    }

    public Coord getCoords () {
        return this.coords;
    }

    public boolean CanSeen(Entity remoteEnt) {
        return visionDistance <= coords.distanceTo(remoteEnt.getCoords());
    }

    @Override
    public int getCloaking() {
        return cloaking;
    }
}
