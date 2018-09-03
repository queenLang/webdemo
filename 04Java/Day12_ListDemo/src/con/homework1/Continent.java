package con.homework1;

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
public class Continent {
   private String continetname;
     private List<Country> continentList  ;

    @Override
    public String toString() {
        return "Continent{" +
                "continetname='" + continetname + '\'' +
                ", continentList=" + continentList +
                '}';
    }

    public String getContinetname() {
        return continetname;
    }

    public void setContinetname(String continetname) {
        this.continetname = continetname;
    }

    public List<Country> getContinentList() {
        return continentList;
    }

    public void setContinentList(List<Country> continentList) {
        this.continentList = continentList;
    }
}
