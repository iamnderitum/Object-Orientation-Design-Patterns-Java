package com.CarAbstraction;

public class Car {

    private String manufacturer;
    private float fuel;
    private float speed;
    private int registrationNum;
    private boolean isRunning;

    public Car(String manuf, float fuel, int regNum){
        manufacturer = manuf;
        this.fuel = fuel;
        registrationNum = regNum;
        speed = 0;
        isRunning = false;
    }

    public void SwitchOn(){
        isRunning = true;
    }

    public void switchOff(){
        isRunning = false;
    }

    public void Accelerate(){
        if(!isRunning)
            return ;

        speed+=2;
        fuel -= 1.5f ;
    }

    public void Brake(){
        speed = 0 ;
    }

    public void Dashboard(){
        System.out.println("speed: " + speed);
        System.out.println("fuel: " + fuel);
    }

    public void FillFuel(float amount){
        fuel += amount;
    }

    public float getFuel(){
        return fuel;
    }

    public float GetSpeed(){
        return speed;
    }
}
