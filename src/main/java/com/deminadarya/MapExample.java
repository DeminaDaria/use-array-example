package com.deminadarya;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public void arrayMapString() {

        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("value", "one");
        stringMap.put("planet", "Sun");
        stringMap.put("Pet", "dog");
        stringMap.put("color", "red");
        System.out.println("Вывод значений ключ значение " + stringMap);

        boolean containsKey = stringMap.containsKey("value");
        System.out.println("Отображает наличие значения " + containsKey);

        boolean containsValue = stringMap.containsValue("red");
        System.out.println("Отображает наличие значения " + containsValue);
    }
}
