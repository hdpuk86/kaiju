package com.example.hayleyprior.kaijuattack;

/**
 * Created by hayleyprior on 25/10/2017.
 */

public abstract class Vehicle {
    String type;
    int healthValue;

    public Vehicle(String type, int healthValue) {
        this.type = type;
        this.healthValue = healthValue;
    }

    public String getType() {
        return type;
    }

    public int getHealthValue() {
        if(healthValue > 0) {
            return healthValue;
        } else {
            return 0;
        }
    }
}
