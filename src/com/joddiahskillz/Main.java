package com.joddiahskillz;

import java.time.LocalDate;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        String brand = "Coding";
        Date date = new Date();

        //Primitive data types to store hole numbers
        byte theByte = -128; //Size in memory 1 byte
        short theShort = 8_388; //Size in memory 2 bytes
        int theInt = 3_333; //Size in memory 4b
        long theLong = 88_687_863_838L; //8b

        //primitive data types to store decimal numbers
        float pi = 3.14F; //6 to 7 decimal digits
        double doublePi = 3.1415;  //stores 15 dd

        boolean isTrue = true;

        char nameInitial = 'A';

        System.out.println("Hooray my first java app");
        System.out.println(theByte);

        //Non Primitive data types = reference types
        String name = new String("Amigoscode");
        System.out.println(name.toUpperCase());
        LocalDate now = LocalDate.now();
        System.out.println(now.getMonth());


        int a = 10;
        int b = a;
        a = 100;
        System.out.println("a = " + a + " and b =" + b);


        Person alex = new Person("alex");
        Person miriam = alex;

        System.out.println("Before changing alex to alexander:");
        System.out.println(alex.name + " " + miriam.name);

        alex.name = "alexander";

        System.out.println("After changing alex to alexander:");
        System.out.println(alex.name + " " + miriam.name);

    }

static class Person{
        String name;
        Person(String giveName){
            this.name = giveName;
        }
}

}
