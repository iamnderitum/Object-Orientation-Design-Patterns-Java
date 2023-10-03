package com.CarAbstraction.oop;

public class GameObject {
    private String name;

    public GameObject(String name){
        this.name = name ;
    }
    public GameObject(){

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void onCollision(GameObject other){
        
    }

}
