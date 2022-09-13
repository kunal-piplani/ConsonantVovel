package com.exercise;

import java.util.*;

public class VowelAndConsonantCount {


    //    public static void main(String[] args) {
//
//        LinkedList<String>s = new LinkedList<>();
//        s.add("KASLKASDF");
//        s.add("asdghjgjsghjfsfsf");
//        s.add("sgjhdghjassf");
//getConstantAndVowelCount(s);
//        if (args.length >= 4) {
//            System.out.println("Extra arguments passed.");
//        } else {
//            Map<String, Integer> vowelCount = new HashMap<>();
//            List<String> argumentList = Arrays.asList(args);
//            argumentList.forEach(argument -> vowelCount.put(argument, getVowelCount(argument)));
//            System.out.println(vowelCount);
//        }
//    }
    public  HashMap ConstantAndVowelCount(LinkedList<String> vowelsAndConsonantList) {
//        int vowels = 0, consonants = 0;
        HashMap<String, ArrayList<Integer>> hashMap = new HashMap<>(); //Contains String and ArrayList Of size 2 {vowel and consonant}
        if (vowelsAndConsonantList.size() > 4) {
            System.out.println("Extra arguments passed.");
            ArrayList<Integer>arr= new ArrayList<>();
            arr.add(-1);
            arr.add(-1);
            hashMap.put("Extra arguments passed",arr);
            return hashMap;
        } else {

            for (int i = 0; i < vowelsAndConsonantList.size(); i++) {
                int vowels = 0, consonants = 0;
                String line = vowelsAndConsonantList.get(i).toLowerCase();
                for (int j = 0; j < line.length(); j++) {
                    char ch = line.charAt(j);
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        ++vowels;
                    } else if ((ch >= 'a' && ch <= 'z')) {
                        ++consonants;
                    }


                }
                ArrayList<Integer> array = new ArrayList();
                array.add(vowels);
                array.add(consonants);

                hashMap.put(vowelsAndConsonantList.get(i), array);
                consonants = 0;
                vowels = 0;

                System.out.println(hashMap);

            }
        }

return hashMap;
        }


    public static void main(String[] args) {
        VowelAndConsonantCount vowelAndConsonantCount =new VowelAndConsonantCount();
        LinkedList<String>linkedList = new LinkedList<>();
        linkedList.add("k@#$%^&");
        vowelAndConsonantCount.ConstantAndVowelCount(linkedList);
    }


}
