package com.CarAbstraction;

public class Program {

    public static void main(String[] args){
        Car car = new Car("BMW", 5, 345345) ;
        car.SwitchOn();
        car.Accelerate();
        car.Accelerate();
        car.Accelerate();
        car.Dashboard();
    }
}
