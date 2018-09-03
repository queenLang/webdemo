package com.queen;

import java.util.List;

/***
 *
 *  .--,       .--,
 * ( (  \.---./  ) )
 *  '.__/o   o\__.'
 *     {=  ^  =}
 *      >  -  <
 *     /       \
 *    //       \\
 *   //|   .   |\\
 *   "'\       /'"_.-~^`'-.
 *      \  _  /--'         `
 *    ___)( )(___
 *   (((__) (__)))    高山仰止,景行行止.虽不能至,心向往之。
 */
public class Traffic {
    private List<Plane> planes;
    private List<Car> cars;
    private List<Ship> ships;

    public Traffic(List<Plane> planes, List<Car> cars, List<Ship> ships) {
        this.planes = planes;
        this.cars = cars;
        this.ships = ships;
    }

    @Override
    public String toString() {
        return "Traffic{" +
                "planes=" + planes +
                ", cars=" + cars +
                ", ships=" + ships +
                '}';
    }

    public List<Plane> getPlanes() {
        return planes;
    }

    public void setPlanes(List<Plane> planes) {
        this.planes = planes;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public List<Ship> getShips() {
        return ships;
    }

    public void setShips(List<Ship> ships) {
        this.ships = ships;
    }
}
