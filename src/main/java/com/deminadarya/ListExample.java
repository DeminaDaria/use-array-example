package com.deminadarya;

import java.util.*;

public class ListExample {

    public void arrayIntListCollection() {

        List<Integer> sortList = new ArrayList<>();
        sortList.add(30);
        sortList.add(390);
        sortList.add(3);
        Collections.sort(sortList);
        System.out.println(sortList);
    }

    public void arrayStringList() {

        String[] stringArray = new String[3];
        stringArray[0] = "sunny";
        stringArray[1] = "dark";
        stringArray[2] = "red";
        Arrays.sort(stringArray);
        System.out.println(Arrays.toString(stringArray));
    }
}
