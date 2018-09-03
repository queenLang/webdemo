package com.homework;

import java.awt.*;

/**
 * Created by dllo on 18/5/2.
 */
public class Transsport {
    private  Car car;
    private  Plane plane;
    private Train train;
    private Ship ship;




    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }
}
