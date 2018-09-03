package com.homework;

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
public class City {
    private String cityName;
    private List<String> didtricts;

    @Override
    public String toString() {
        return "City{" +
                "cityName='" + cityName + '\'' +
                ", didtricts=" + didtricts +
                '}';
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public List<String> getDidtricts() {
        return didtricts;
    }

    public void setDidtricts(List<String> didtricts) {
        this.didtricts = didtricts;
    }
}
