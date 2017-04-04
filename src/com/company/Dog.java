package com.company;

/**
 * Created by idejesus on 04/04/2017.
 */
public  class Dog {
private final String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public final boolean equals(Object obj) {
         if(this == obj){
             return true;
         }
         if(obj instanceof Dog){
             String objName = ((Dog) obj).getName();
             return this.name.equalsIgnoreCase(objName);
         }

         return false;
    }
}
