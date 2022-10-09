package Practical2;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        String str = "This is a Hello World Program for Practical2 of PART7";
        Map<String, Integer> hashMap = new HashMap<>();
        String[] words = str.split(" ");


        for (String word : words) {
            hashMap.merge(word, 1, Integer::sum);
        }
        TreeMap<String,Integer> tm=new  TreeMap<String,Integer>(hashMap);
        Iterator itr=tm.keySet().iterator();
        while(itr.hasNext())
        {
            String key= (String) itr.next();
            System.out.println( key +" "+hashMap.get(key));
        }
        System.out.println("Prepared By PATEL KARM HITESHKUMAR(21CE095)");

    }
}
