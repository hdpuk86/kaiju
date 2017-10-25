package com.example.hayleyprior.kaijuattack;

/**
 * Created by hayleyprior on 25/10/2017.
 */

public abstract class Kaiju {
    String name;
    int healthValue;
    int attackValue;

    public Kaiju(String name, int healthValue, int attackValue) {
        this.name = name;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public String getName() {
        return name;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public String roar() {
        return "ROARR!";
    }

    public abstract String attack(Vehicle vehicle);

    public abstract String move();

}
