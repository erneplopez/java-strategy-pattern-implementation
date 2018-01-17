package com.example;

import com.example.vehicle.EightWheelsMovableImpl;
import com.example.vehicle.FourWheelsMovableImpl;
import com.example.vehicle.Transformer;
import com.example.vehicle.TwoWheelsMovableImpl;

public class Main {

    public static void main(String[] args) {
        Transformer optimusPrime=new Transformer();

        System.out.println("Optimus prime just transformed into a truck!!!!");
        optimusPrime.setMovable(new EightWheelsMovableImpl());
        System.out.println(optimusPrime.move());

        System.out.println("Wait... Optimus prime is a cool bike now!!!!");
        optimusPrime.setMovable(new TwoWheelsMovableImpl());
        System.out.println(optimusPrime.move());

        System.out.println("I can't believe my eyes, Optimus prime is not longer a bike, now is a Ferrari!!!!");
        optimusPrime.setMovable(new FourWheelsMovableImpl());
        System.out.println(optimusPrime.move());
    }
}
