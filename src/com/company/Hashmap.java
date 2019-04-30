package com.company;



import java.util.HashMap;
import java.util.Scanner;

public class Hashmap {

    public static void main(String[] args) {

        HashMap<Integer,String>myMap= new HashMap<Integer, String>();
        Scanner input=new Scanner(System.in);

        myMap.put(1,"One");
        myMap.put(2,"Two");
        myMap.put(3,"Three");
        myMap.put(4,"Four");
        myMap.put(5,"Five");
        myMap.put(6,"Six");
        myMap.put(7,"Seven");
        myMap.put(8,"Eight");
        myMap.put(9,"Nine");
        myMap.put(10,"Ten");
        System.out.println("You've entered 10 values: "+myMap);
        System.out.println("Enter a key");
        int key= input.nextInt();
//



        if (myMap.containsKey(key))
        {
            System.out.println("You've entered key: "+myMap.get(key));
        }
        else
        {
            addValue(key,myMap);
        }



        // write your code here
    }
    public static void addValue(int key,HashMap map)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number value");
        String value = input.nextLine();
        map.put(key, value);
        System.out.println("You've entered value: " + map.get(key));
    }

}