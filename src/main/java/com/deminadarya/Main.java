package com.deminadarya;

public class Main {

    public static void main(String[] args) {

        ListExample listExample = new ListExample();
        listExample.arrayIntListCollection();
        listExample.arrayStringList();

        SetExample setExample = new SetExample();
        setExample.arrayIntSet();

        MapExample mapExample = new MapExample();
        mapExample.arrayMapString();
    }
}
