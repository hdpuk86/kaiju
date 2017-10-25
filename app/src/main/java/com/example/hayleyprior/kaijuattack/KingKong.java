package com.example.hayleyprior.kaijuattack;


import com.example.hayleyprior.kaijuattack.behaviours.Offensible;

/**
 * Created by hayleyprior on 25/10/2017.
 */

public class KingKong extends Kaiju {

    public KingKong(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);
    }


    public String roar() {
        return this.name + " " + super.roar();
    }

    @Override
    public String move() {
        return getName() + " lunged forwards!";
    }

    @Override
    public String attack(Vehicle vehicle) {
        vehicle.healthValue -= this.attackValue;
        return getName() + " used PUNCH on " + vehicle.getType() + ". " + vehicle.getType() + "'s health is now " + vehicle.getHealthValue();
    }
}
