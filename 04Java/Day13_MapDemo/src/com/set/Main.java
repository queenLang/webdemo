package com.set;

import java.util.HashSet;
import java.util.Set;

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
         * Set----->HashSet
         * Set无序且不能重复
         *
         */
        Set<String> stringSet = new HashSet<>();
        stringSet.add("1");
        stringSet.add("1");
        stringSet.add("1");
        stringSet.add("1");
        stringSet.add("1");
        stringSet.add("1");
        stringSet.add("2");
        stringSet.add("3");
        stringSet.add("4");

        for (String s : stringSet) {
            System.out.println(s );
        }







    }
}
