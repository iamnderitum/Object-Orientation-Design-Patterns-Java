package com.CarAbstraction;

public class Program {

    public static void main(String[] args){
        Car car = new Car("BMW", 5, 345345) ;
        car.FillFuel(20);
        car.SwitchOn();
        car.Accelerate();
        System.out.println("First Acceleration: " + car.GetSpeed() + "Remaining fuel: " + car.getFuel()); //2 3.5
        car.Accelerate();
        car.Accelerate();
        System.out.println("Final Acceleration: " + car.GetSpeed());//6
        car.Dashboard();
    }
}
