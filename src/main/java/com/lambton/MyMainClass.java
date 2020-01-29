package com.lambton;

import jdk.nashorn.internal.ir.PropertyNode;

import java.util.*;

public class MyMainClass
{
    public static void main(String[] args)
    {
        ArrayList<String>countryList = new ArrayList<>();
        countryList.add("Canada");
        countryList.add("India");
        countryList.add("Philippines");
        countryList.add("Japan");

        System.out.println(countryList.get(1));

        for (String name: countryList)
        {
            System.out.println(name);
        }

        for (int i = 0; i < countryList.size(); i++)
        {
            System.out.println(countryList.get(i));
        }

        HashSet<String>c = new HashSet<>();

        c.add("A");
        c.add("Bca");

        c.add("A");
        c.add("B");
        c.add("C");
        c.add("D");


        // c.remove(o:"B");

        for (String s: c)
        {
            System.out.println(s);
        }

        HashMap<String, String>hashMap = new HashMap<>();
        hashMap.put("IND","India");
        hashMap.put("NEP","Nepal");
        hashMap.put("IND","Infinashnkasn");


        for (Map.Entry<String, String>entry:hashMap.entrySet())
        {
            System.out.println(entry.getKey() + "_" + entry.getValue());
        }

        HashMap<String, ArrayList<String>> countryStatesList = new HashMap<>();



    }


}
