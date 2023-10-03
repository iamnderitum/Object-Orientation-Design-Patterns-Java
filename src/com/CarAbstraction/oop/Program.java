package com.CarAbstraction.oop;

public class Program {
    public static void main (String[] args){
        FireHydrant fh = new FireHydrant();
        fh.setName("FireHydrant");
        fh.setDamage(100);
        System.out.println(fh.getName());
        GameObject go = fh;
        go.setName("FireHydrant -2");

        System.out.println(fh.getName());
    }
}
