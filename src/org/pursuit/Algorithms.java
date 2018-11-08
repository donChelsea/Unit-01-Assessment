package org.pursuit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Algorithms implements DataStructures {


    @Override
    public char[] stringToCharArray(String word) {
        char[] chars = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            chars[i] = word.charAt(i);
        }
        return chars;
    }

    @Override
    public ArrayList<Integer> multiplicationTableList(int number) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            integerArrayList.add(number * i);
        }
        return integerArrayList;
    }

    @Override
    public HashMap<String, Integer> wordLength(String[] wordArray) {
        HashMap<String, Integer> stringIntegerHashMap = new HashMap<>();
        for (String str : wordArray) {
            stringIntegerHashMap.put(str, str.length());
        }
        return stringIntegerHashMap;
    }

    @Override
    public HashSet<Character> uniqueCharacters(String word) {
        HashSet<Character> characterHashSet = new HashSet<>();
        for (int i = 0; i < word.length(); i++) {
            characterHashSet.add(word.charAt(i));
        }
        return characterHashSet;
    }
}
