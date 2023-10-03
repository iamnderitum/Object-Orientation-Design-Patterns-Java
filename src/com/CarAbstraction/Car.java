package com.CarAbstraction;

public class Car {

    private String manufacturer;
    private float fuel;
    private float speed;
    private int registrationNum;
    private boolean isRunning;

    void SwitchOn(){
        isRunning = true;
    }

    void switchOff(){
        isRunning = false;
    }

    void Accelerate(){
        if(!isRunning)
            return ;

        speed++;
        fuel -= 1.5f ;
    }

    void Brake(){
        speed = 0 ;
    }

    void Dashboard(){
        System.out.println("speed: " + speed);
        System.out.println("fuel: " + fuel);
    }
}
