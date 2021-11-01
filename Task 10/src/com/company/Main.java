package com.company;

import java.util.*;

public class Main {

    static public Set unionSet(Set set1, Set set2){
        Iterator<Object> iterator = set1.iterator();
        Set resultSet = new HashSet();
        resultSet.clear();
        while (iterator.hasNext()){
            resultSet.add(iterator.next());
        }
        iterator = set2.iterator();

        while (iterator.hasNext()){
            resultSet.add(iterator.next());
        }
        return resultSet;
    }

    static public Set intersectSet(Set set1, Set set2){
        Iterator<Object> iterator = set2.iterator();
        Set resultSet = new HashSet();
        resultSet.clear();
        while (iterator.hasNext()){
            Object obj = iterator.next();
            if(set1.contains(obj)){
                resultSet.add(obj);
            }
        }
        return resultSet;
    }

    public static void main(String[] args) {
        System.out.println("1)");
        Set<String> set1 = new HashSet<>();
        set1.add("ivan");
        set1.add("petro");
        set1.add("ira");

        Set<String> set2 = new HashSet<>();
        set2.add("ira");
        set2.add("ivan");
        set2.add("andrew");
        set2.add("vasyl");

        Set<String> resultSet = new HashSet<>();

        resultSet = unionSet(set1, set2);

        System.out.println("Union:");
        System.out.println("set1 = " + set1);
        System.out.println("set2 = " + set2);
        System.out.println("union = " + resultSet);

        System.out.println("Intersection:");
        resultSet = intersectSet(set1, set2);

        System.out.println("set1 = " + set1);
        System.out.println("set2 = " + set2);
        System.out.println("intersection: " + resultSet);



        System.out.println("2)");

        Map<String, String> personalMap = new HashMap<>();
        personalMap.put("Kuzmenko", "Ihor");
        personalMap.put("Pavlenko", "Maks");
        personalMap.put("Melnyk", "Artur");
        personalMap.put("Koval", "Artem");
        personalMap.put("Shvets", "Maks");
        personalMap.put("Havrylyuk", "Mykola");
        personalMap.put("Tarasenko", "Andrew");
        personalMap.put("Radchenko", "Vasyl");
        personalMap.put("Vovk", "Ivan");
        personalMap.put("Kozlov", "Nazar");

        out:
        for (int i = 0; i < personalMap.size() - 1; i++){
            for (int j = i + 1; j < personalMap.size(); j++) {
                if(personalMap.values().toArray()[i] == personalMap.values().toArray()[j]){
                    System.out.println("There are two persons with the same firstName.");
                    break out;
                }
                if(i == personalMap.size() - 2 && j == personalMap.size() - 1){
                    System.out.println("There aren't two persons with the same firstName.");
                }
            }
        }

        for (int i = 0; i < personalMap.size(); i++) {
            if(personalMap.values().toArray()[i] == "Maks"){
                System.out.println("Person with key: " + personalMap.keySet().toArray()[i] +
                        " and value: " + personalMap.values().toArray()[i] + " has been removed!");
                personalMap.remove(personalMap.keySet().toArray()[i]);
            }
        }

    }
}
