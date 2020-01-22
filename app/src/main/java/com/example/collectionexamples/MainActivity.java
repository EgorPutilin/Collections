package com.example.collectionexamples;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Cat> cats;
    private HashMap<Integer, Cat> map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cats = catArrayList();
        map = catHashMap();
        catArrayList();
        catHashMap();

        printWithArray(cats);
        printWithHashMap(map);
        sortWithAge(cats);
    }

    private ArrayList<Cat> catArrayList() {
        ArrayList cats = new ArrayList();
        for (int i = 0; i < 10; i++) {
            cats.add(new Cat("Simon", (int) (Math.random() * 10)));
        }
        return cats;
    }

    private HashMap<Integer, Cat> catHashMap() {
        HashMap<Integer, Cat> mapCats = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            mapCats.put(i, new Cat("Mike",(int) (Math.random() * 10)));
        }
        return mapCats;
    }

    private void printWithArray(ArrayList<Cat> cats) {
        for (int i = 0; i < cats.size(); i++) {
            System.out.println("Cats name is " + cats.get(i).getName() + " ; Cats Age is " + cats.get(i).getAge());
        }
    }

    private void printWithHashMap(HashMap<Integer, Cat> cats) {
        for (int i = 0; i < cats.size(); i++) {
            System.out.println("Cats name is " + cats.get(i).getName() + " ; Cats Age is " + cats.get(i).getAge());
        }
    }

    //become older
    private void sortWithAge(ArrayList<Cat> cats) {
        int helper = cats.get(0).getAge();

        for (int i = 0; i < cats.size(); i++) {
            int helper2 = cats.get(i).getAge();
            if (helper2 > helper) {
                helper = cats.get(i).getAge();
            }
        }

        System.out.println("Max Cats age is " + helper);
    }

    private void print2(ArrayList<Cat> cats) {
        for (Cat cat: cats) {
            System.out.println("Cat name: " + cat.getName());
        }
    }

}
