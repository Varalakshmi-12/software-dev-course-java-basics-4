package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CollectionExercises {
    public String[] makeFruitStringArray() {
        // EXAMPLE:
        // Create and return an array of strings with the following values:
        // "apple", "banana", "cherry", "date", "elderberry"
        // Replace the line below with your implementation
        String[] fruits = new String[5];
        fruits[0] = "apple";
        fruits[1] = "banana";
        fruits[2] = "cherry";
        fruits[3] = "date";
        fruits[4] = "elderberry";

        return fruits;
    }

    public String[] makeFruitStringArrayWithSize(int size) {
        // Create and return an array of strings with the given size (from the parameter)
        // Use a loop to set every element to "apple"
        // Replace the line below with your implementation
        String[] newSameFruits =new String[size];
        for (int i = 0;i < newSameFruits.length;i++){
            newSameFruits[i] = "apple";
        }
        return newSameFruits;
    }

    public String[] makeTopThreeArray(String[] fruits) {
        // Create and return a new array of strings containing the first three elements of the given array
        // Replace the line below with your implementation
        String[] topThreeFruits =new String[3];
        topThreeFruits[0]=fruits[0];
        topThreeFruits[1]=fruits[1];
        topThreeFruits[2]=fruits[2];
        return topThreeFruits;
    }

    public ArrayList<String> makeFruitList() {
        // Create and return an ArrayList of strings with the following values:
        // "apple", "banana", "cherry", "date", "elderberry"
        // Replace the line below with your implementation
        ArrayList<String> arrayListFruits =new ArrayList<String>();
        arrayListFruits.add("apple");
        arrayListFruits.add("banana");
        arrayListFruits.add("cherry");
        arrayListFruits.add("date");
        arrayListFruits.add("elderberry");

        return arrayListFruits;
    }

    public ArrayList<String> makeListOfThreeFruits(String fruit1, String fruit2, String fruit3) {
        // Create and return an ArrayList of strings with the given values
        // Replace the line below with your implementation
        ArrayList<String> listOfGivenFruits =new ArrayList<String>();
        listOfGivenFruits.add(fruit1);
        listOfGivenFruits.add(fruit2);
        listOfGivenFruits.add(fruit3);

        return listOfGivenFruits;
    }

    public HashMap<String, String> makeFruitMap() {
        // Create and return a HashMap with the following key-value pairs:
        // "apple" -> "red", "banana" -> "yellow", "cherry" -> "red", "date" -> "brown", "elderberry" -> "black"
        // Replace the line below with your implementation
        HashMap<String,String> mapKeyValues=new HashMap<String,String>();
        mapKeyValues.put("apple","red");
        mapKeyValues.put("banana","yellow");
        mapKeyValues.put("cherry","red");
        mapKeyValues.put("date","brown");
        mapKeyValues.put("elderberry","black");
        return mapKeyValues;
    }

    public String lookupAppleColor(HashMap<String, String> fruitMap) {
        // Return the value associated with the key "apple" in the given map, using the get method
        // Replace the line below with your implementation
        return fruitMap.get("apple");
    }

    public HashSet<String> makeFruitSet(String fruit1, String fruit2, String fruit3) {
        // Create and return a HashSet of strings with the given values
        // Replace the line below with your implementation
        HashSet<String> setFruits=new HashSet<String>();
        setFruits.add(fruit1);
        setFruits.add(fruit2);
        setFruits.add(fruit3);
        return setFruits;
    }
}
