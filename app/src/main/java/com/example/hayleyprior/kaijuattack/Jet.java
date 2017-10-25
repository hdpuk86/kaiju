package com.example.hayleyprior.kaijuattack;

import com.example.hayleyprior.kaijuattack.behaviours.Offensible;

/**
 * Created by hayleyprior on 25/10/2017.
 */

public class Jet extends Vehicle implements Offensible {
    int shootStrength;
    int missileStrength;

    public Jet(String type, int healthValue, int shootStrength, int missileStrength) {
        super(type, healthValue);
        this.shootStrength = shootStrength;
        this.missileStrength = missileStrength;
    }

    @Override
    public String shoot(Kaiju kaiju) {
        kaiju.healthValue -= this.shootStrength;
        return getType() + " shot " + kaiju.getName() + ". " + kaiju.getName() + "'s health is now " + kaiju.getHealthValue();
    }

    @Override
    public String launchMissile(Kaiju kaiju) {
        kaiju.healthValue -= this.missileStrength;
        return getType() + " launched a missile at " + kaiju.getName() + ". " + kaiju.getName() + "'s health is now " + kaiju.getHealthValue();
    }
}
