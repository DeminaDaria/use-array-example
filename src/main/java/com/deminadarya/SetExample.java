package com.deminadarya;

import java.util.*;

public class SetExample {

    public void arrayIntSet() {

        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(99);
        integerSet.add(980);
        integerSet.add(9);
        integerSet.add(0);
        integerSet.add(5);
        System.out.println("Добавлено 5 значений" + integerSet);

        integerSet.remove(9);
        System.out.println("Удалено 1 значение" + integerSet);

        List<Integer> integerList = new ArrayList<>(integerSet);
        Collections.sort(integerList);
        System.out.println("Сортировка значений" + integerList);
    }
}
