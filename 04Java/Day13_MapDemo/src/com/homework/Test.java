package com.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
public class Test {
    public static void main(String[] args) {
        // 创建市集合xxxShi
        List<String> dalianShi = new ArrayList<>();
        dalianShi.add("沙河口区");
        List<String> haerbinShi = new ArrayList<>();
        haerbinShi.add("香坊区");
        List<String> zhahuangShi = new ArrayList<>();
        zhahuangShi.add("札幌市的某一个区");
        List<String> xiantaiShi = new ArrayList<>();
        xiantaiShi.add("仙台市的某一个区");
        List<String> montgomeryShi = new ArrayList<>();
        montgomeryShi.add("蒙哥马利的某一个区");
        List<String> juneauShi = new ArrayList<>();
        juneauShi.add("朱诺的某一个区");
        List<String> torontoShi = new ArrayList<>();
        torontoShi.add("多伦多的某一个区");
        List<String> yellowknifeShi = new ArrayList<>();
        yellowknifeShi.add("耶罗纳夫的某一个区");


        // 创建市map 装市名->市集合<String, xxxShi>
        Map<String, List<String>> dalianMap = new HashMap<>();
        dalianMap.put("大连市", dalianShi);
        Map<String, List<String>> haerbinMap = new HashMap<>();
        haerbinMap.put("哈尔滨市", haerbinShi);
        Map<String, List<String>> beihaidaoMap = new HashMap<>();
        beihaidaoMap.put("札幌市", zhahuangShi);
        Map<String, List<String>> gongchengxianMap = new HashMap<>();
        gongchengxianMap.put("仙台市", xiantaiShi);
        Map<String, List<String>> montgomeryMap = new HashMap<>();
        montgomeryMap.put("蒙哥马利", montgomeryShi);
        Map<String, List<String>> juneauMap = new HashMap<>();
        juneauMap.put("朱诺", juneauShi);
        gongchengxianMap.put("仙台市", xiantaiShi);
        Map<String, List<String>> torontoMap = new HashMap<>();
        torontoMap.put("多伦多", montgomeryShi);
        Map<String, List<String>> yellowknifeMap = new HashMap<>();
        yellowknifeMap.put("耶罗纳夫", yellowknifeShi);

        // 创建省数组xxxProvince 装市map
        Map<String, List<String>>[] liaoningProvince = new HashMap[1];
        liaoningProvince[0] = dalianMap;
        Map<String, List<String>>[] heilongjiangProvince = new HashMap[1];
        heilongjiangProvince[0] = haerbinMap;
        Map<String, List<String>>[] ribensheng1Province = new HashMap[1];
        ribensheng1Province[0] = beihaidaoMap;
        Map<String, List<String>>[] ribensheng2Province = new HashMap[1];
        ribensheng2Province[0] = gongchengxianMap;
        Map<String, List<String>>[] alabamaProvince = new HashMap[1];
        alabamaProvince[0] = montgomeryMap;
        Map<String, List<String>>[] alaskaProvince = new HashMap[1];
        alaskaProvince[0] = juneauMap;
        Map<String, List<String>>[] ontarioProvince = new HashMap[1];
        ontarioProvince[0] = torontoMap;
        Map<String, List<String>>[] northwestTerritoriesProvince = new HashMap[1];
        northwestTerritoriesProvince[0] = yellowknifeMap;


        // 创建省map 装省名->省数组<String, xxxProvince>
        Map<String,Map<String, List<String>>[]> liaoningMap = new HashMap<>();
        liaoningMap.put("辽宁省",liaoningProvince);
        Map<String,Map<String, List<String>>[]> heilongjiangMap = new HashMap<>();
        heilongjiangMap.put("黑龙江省",heilongjiangProvince);
        Map<String,Map<String, List<String>>[]> ribensheng1Map = new HashMap<>();
        ribensheng1Map.put("日本省1",ribensheng1Province);
        Map<String,Map<String, List<String>>[]> ribensheng2Map = new HashMap<>();
        ribensheng2Map.put("日本省2",ribensheng2Province);
        Map<String,Map<String, List<String>>[]> alabamaMap = new HashMap<>();
        alabamaMap.put("阿拉巴马州",alabamaProvince);
        Map<String,Map<String, List<String>>[]> alaskaMap = new HashMap<>();
        alaskaMap.put("阿拉斯加州",alaskaProvince);
        Map<String,Map<String, List<String>>[]> ontarioMap = new HashMap<>();
        ontarioMap.put("安大略省",ontarioProvince);
        Map<String,Map<String, List<String>>[]> northWestTerrioriesMap = new HashMap<>();
        northWestTerrioriesMap.put("西北地区",northwestTerritoriesProvince);

        // 创建国家集合xxxCountry 装省map
        List<Map<String,Map<String, List<String>>[]>> chinaCountry = new ArrayList<>(); // 中国
        chinaCountry.add(liaoningMap);
        chinaCountry.add(heilongjiangMap);
        List<Map<String,Map<String, List<String>>[]>> japanCountry = new ArrayList<>(); // 中国
        japanCountry.add(ribensheng1Map);
        japanCountry.add(ribensheng2Map);
        List<Map<String,Map<String, List<String>>[]>> americaCountry = new ArrayList<>(); // 中国
        americaCountry.add(alabamaMap);
        americaCountry.add(alaskaMap);
        List<Map<String,Map<String, List<String>>[]>> canadaCountry = new ArrayList<>(); // 中国
        canadaCountry.add(ontarioMap);
        canadaCountry.add(northWestTerrioriesMap);

        // 创建国家map 装国家名->国家集合<String, xxxCountry>
        Map<String,List<Map<String,Map<String, List<String>>[]>>> chinaMap = new HashMap<>();
        chinaMap.put("中国",chinaCountry);
        Map<String,List<Map<String,Map<String, List<String>>[]>>> japanMap = new HashMap<>();
        japanMap.put("日本",japanCountry);
        Map<String,List<Map<String,Map<String, List<String>>[]>>> americaMap = new HashMap<>();
        americaMap.put("美国",americaCountry);
        Map<String,List<Map<String,Map<String, List<String>>[]>>> canadaMap = new HashMap<>();
        canadaMap.put("加拿大",canadaCountry);

        // 创建洲数组xxxContinent 装国家map
        Map<String,List<Map<String,Map<String, List<String>>[]>>>[] asiaContinent =
                new HashMap[2];
        asiaContinent[0]=chinaMap;
        asiaContinent[1]=japanMap;
        Map<String,List<Map<String,Map<String, List<String>>[]>>>[] northAmericaContinent =
                new HashMap[2];
        northAmericaContinent[0]=americaMap;
        northAmericaContinent[1]=canadaMap;

        // 创建洲map 装洲名->洲数组<String, xxxContinent>
        Map<String,Map<String,List<Map<String,Map<String, List<String>>[]>>>[]> asiaMap =
                new HashMap<>();
        asiaMap.put("亚洲",asiaContinent);
        Map<String,Map<String,List<Map<String,Map<String, List<String>>[]>>>[]> northAmericaMap =
                new HashMap<>();
        northAmericaMap.put("北美洲",northAmericaContinent);

        // 创建世界集合 装洲map
        List<Map<String,Map<String,List<Map<String,Map<String, List<String>>[]>>>[]>> world =
                new ArrayList<>();
        world.add(asiaMap);
        world.add(northAmericaMap);


        // 如何找到区
        // 世界集合 -> get(0) -> 洲map -> get("") -> 洲数组 -> [0] -> 国家map -> get("") -> 国家集合
        // -> get(0) -> 省map -> get("") -> 省数组 -> [0] -> 市map -> 市集合 -> get(0) -> 区String

        System.out.println(world.get(0).get("亚洲")[0].get("中国").get(0).get("辽宁省")[0].get("大连市").get(0));

        for (Map<String, Map<String, List<Map<String, Map<String, List<String>>[]>>>[]> contientMap : world) {
            for (String contientName : contientMap.keySet()) {
                System.out.println(contientName);
                for (Map<String, List<Map<String, Map<String, List<String>>[]>>> countryMap : contientMap.get(contientName)) {
                    for (String countryName : countryMap.keySet()) {
                        System.out.println(countryName);
                        for (Map<String, Map<String, List<String>>[]> provinceMap : countryMap.get(countryName)) {
                            for (String provinceName : provinceMap.keySet()) {
                                System.out.println(provinceName);
                                for (Map<String, List<String>> cityMap : provinceMap.get(provinceName)) {
                                    for (String cityName : cityMap.keySet()) {
                                        System.out.println(cityName);
                                        for (String districtName : cityMap.get(cityName)) {
                                            System.out.println(districtName);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}



