package Weeks.Week_17;

import java.util.*;

/**
 * 1 - Works with Key-Value principle
 * 2 - All the keys in a Map must be unique
 */

/**
 * JSON FORMAT
 */

public class MyMap {

    public static void main(String[] args) {
        //exampleMap();
        Map<Integer, Integer> map = new HashMap<>();
        map.put(10, 48);
        map.put(1, 58);
        map.put(2, 76);
        map.put(1, 32);

        String resume = "tarik yaklasik 5 yildir Amazonda calisiyorum Java ile su projeyi yaptim" +
                "sonra yine java kullanarak su projede yer aldim " +
                "Selenium Java ve TestNG dersleri vererek Inar Academy ogerencilerinin ise girmesinde yardimci olmaya calistim";

        Set<String> jobDescriptionKeys = new HashSet<>();
        jobDescriptionKeys.add("selenium");
        jobDescriptionKeys.add("testng");
        jobDescriptionKeys.add("java");


        interviewQuestion(resume, jobDescriptionKeys);

    }

    private static void interviewQuestion(String resume, Set<String> jd) {
        Map<String, Integer> map = new HashMap();
        String[] resumeArr = resume.toLowerCase().split("\\s");

        for (String word: resumeArr) {
            if(jd.contains(word)) {
                // java calisiyorum ve java benim hayatim java
                if (map.containsKey(word)) {
                    int number = map.get(word);
                    map.put(word, number + 1);
                } else {
                    map.put(word, 1);
                }
            }
        }
        print(map);



    }

    private static void exampleMap() {
        Map<String,String> inarMap = new HashMap<>();
        inarMap.put("kurulus yili", "2020");
        inarMap.put("ogrenci sayisi", "42");
        inarMap.put("Java ogretmeni", "Tarik");
        print(inarMap);

    }

    private static void print(Map map){
        Set<String> set = map.keySet();
        for (String key: set) {
            System.out.println(key + ":" + map.get(key));
        }
    }
}
