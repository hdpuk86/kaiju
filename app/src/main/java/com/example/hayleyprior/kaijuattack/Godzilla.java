package com.example.hayleyprior.kaijuattack;

import com.example.hayleyprior.kaijuattack.behaviours.Offensible;

/**
 * Created by hayleyprior on 25/10/2017.
 */

public class Godzilla extends Kaiju {


    public Godzilla(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);
    }

    public String roar() {
        return super.roar() + " I am Godzilla!";
    }

    @Override
    public String move() {
        return getName() + " swung around!";
    }

    @Override
    public String attack(Vehicle vehicle) {
        vehicle.healthValue -= this.attackValue;
        return getName() + " used FIRE on " + vehicle.getType() + ". " + vehicle.getType() + "'s health is now " + vehicle.getHealthValue();
    }
}
