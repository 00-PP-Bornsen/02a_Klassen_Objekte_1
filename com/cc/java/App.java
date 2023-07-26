package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        /* Instanziierung Klasse --> Objekt */
        // Cat -- Referenztyp
        // cat -- Referenzvariable

        Cat cat1 = new Cat();
        System.out.println("Blick von aussen: " + cat1);
        cat1.tellYourAddress();

        cat1.testObj();
        Cat.testClass();

        System.out.println(Math.abs(-1));

        System.out.println("--------------------");
     
        // Cat cat2 = new Cat();
        // System.out.println("Blick von aussen: " + cat2);
        // cat2.tellYourAddress();

      


    }

   

}

