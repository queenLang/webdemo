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
public class City {
   private String name,area,area2,area3;

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", area='" + area + '\'' +
                ", area2='" + area2 + '\'' +
                ", area3='" + area3 + '\'' +
                '}';
    }

    public City() {
    }

    public City(String name, String area, String area2, String area3) {
        this.name = name;
        this.area = area;
        this.area2 = area2;
        this.area3 = area3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAera2() {
        return area2;
    }

    public void setAera2(String aera2) {
        this.area2 = aera2;
    }

    public String getArea3() {
        return area3;
    }

    public void setArea3(String area3) {
        this.area3 = area3;
    }
}
