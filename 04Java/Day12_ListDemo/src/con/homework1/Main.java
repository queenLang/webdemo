package con.homework1;

import java.util.ArrayList;
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
public class Main {
    public static void main(String[] args) {
        /**
         * 创建一个大洲continent集合
         * 2大洲
         * 每一个大洲包含两个国家country
         * 每个国家写出两个省province
         * 每个省写出一个省会城市city
         * 一个省会城市一个区 district
         */

        //创建一个大洲的集合
        List<Continent> continentList = new ArrayList<>();
        Continent continent = new Continent();
        continent.setContinetname("亚洲");
        //创建国家的集合
        List<Country> countryList = new ArrayList<>();
        //创建国家的对象
        Country country = new Country();
        country.setCountryname("中国");
        Country country1 = new Country();
        country1.setCountryname("朝鲜");
        //创建省的集合
        List<Province> provinceList = new ArrayList<>();
        List<Province> provinceList1 = new ArrayList<>();
        //创建省的对象
        Province province = new Province();
        province.setProvincename("辽宁省");
        Province province1 = new Province();
        province1.setProvincename("朝鲜省1");
        Province province2 = new Province();
        province2.setProvincename("朝鲜省2");
        //创建市的集合
        List<City> cityList = new ArrayList<>();
        List<City> cityList1 = new ArrayList<>();
        //创建市的对象
        City city = new City();
        city.setCityname("大连");
        City city1 = new City();
        city1.setCityname("平壤");
        //区集合
        List<String> DistrictList = new ArrayList<>();
        List<String> DistrictList1 = new ArrayList<>();
        DistrictList.add("沙河口区");
        DistrictList1.add("平壤区1");
        //将区集合加入到市中
        city.setDistrictList(DistrictList);
        city1.setDistrictList(DistrictList1);
        //将城市加入到市集合中
        cityList.add(city);
        cityList1.add(city1);
        //将市集合加入到省中
        province.setCityList(cityList);
        province1.setCityList(cityList1);
        //省到省集合
        provinceList.add(province);
        provinceList1.add(province1);
        provinceList1.add(province2);
        //将省集合加入到国家
        country.setProvinceList(provinceList);
        country1.setProvinceList(provinceList1);
        //国家加入国家集合
        countryList.add(country);
        countryList.add(country1);
        //国家集合加入大洲
        continent.setContinentList(countryList);
        //大洲加入到大洲集合
        continentList.add(continent);

        for (Continent continent1 : continentList) {
            System.out.println(continent1);
        }

        System.out.println(continentList.get(0)
                .getContinentList().get(0)
                .getProvinceList().get(0)
                .getCityList().get(0)
               .getDistrictList().get(0));













    }
}
