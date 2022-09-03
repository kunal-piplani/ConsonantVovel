package com.exercise;

import java.util.*;

public class VowelCount {


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
    public static HashMap getConstantAndVowelCount(LinkedList<String> strings) {
        int countv = 0;
        int counts = 0;
        HashMap<String, ArrayList<Integer>> hashMap = new HashMap<>(); //Contains String and ArrayList Of size 2 {vowel and consonant}
        if (strings.size() > 4) {
            System.out.println("Extra arguments passed.");
        } else {
            for (int i = 0; i < strings.size(); i++) {

                for (int j = 0; j < strings.get(i).length(); j++) {
                    if (strings.get(i).charAt(j) == 'a' || strings.get(i).charAt(j) == 'e' || strings.get(i).charAt(j) == 'i' || strings.get(i).charAt(j) == 'o'
                            || strings.get(i).charAt(j) == 'u' || strings.get(i).charAt(j) == 'A' || strings.get(i).charAt(j) == 'E' || strings.get(i).charAt(j) == 'I' || strings.get(i).charAt(j) == 'O'
                            || strings.get(i).charAt(j) == 'U') {

                        countv++;
                    }



else {
    if(Character.isDigit(strings.get(i).charAt(j))||Character.isWhitespace(strings.get(i).charAt(j))
    || !(Character.isLetter(strings.get(i).charAt(j))
    )){

    }
        else {
        counts++;
    }
}

                }
                ArrayList<Integer> array = new ArrayList();
                array.add(countv);
                array.add(counts);

                hashMap.put(strings.get(i), array);
                counts = 0;
                countv = 0;
            }
            System.out.println(hashMap);

        }
return hashMap;
    }

    private static Integer getVowelCount(String input) {
        String[] inputChars = input.split("");
        return (int) Arrays.stream(inputChars).filter(inputChar -> inputChar.matches("[aeiou]")).count();


    }

}
