package Chapters.BitiyorGonlumunEfendisi.Map;

import java.util.*;

public class E_1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("ferrari", 1);
        map.put("kılıçdaroğlu",0);
        map.put("aday olmasın",68588865);
        map.put("wolswogen",2);
        map.put("audi",11);
        map.put("inar 1 numara", 99);
        map.put("inar academy",12);
        map.put("elma",45);
        map.put("armut",23);
        map.put("kefir", 32);

        for (Map.Entry<String,Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "-->" + entry.getValue());
        }
    }
}
