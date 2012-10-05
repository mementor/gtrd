package com.meriman.gtrd;

/**
 * User: Mentor <debiboon@gmail.com>
 * Date: 05.10.12
 * Time: 14:02
 */
public class Coord {
    public int x;
    public int y;

    public double distanceTo(Coord remoteCoord) {
        return Math.sqrt(Math.pow(remoteCoord.x-x,2)+Math.pow(remoteCoord.y-y,2));
    }
}
