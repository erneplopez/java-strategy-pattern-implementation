package com.example.vehicle;

public abstract class Vehicle {
    Movable movable;

    public void setMovable(Movable movable) {
        this.movable = movable;
    }
    public String move(){
        return movable.move();
    }
}
