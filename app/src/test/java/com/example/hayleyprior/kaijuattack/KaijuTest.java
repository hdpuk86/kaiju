package com.example.hayleyprior.kaijuattack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by hayleyprior on 25/10/2017.
 */

public class KaijuTest {
    Godzilla godzilla;
    KingKong kingKong;
    Tank tank;
    Jet jet;

    @Before
    public void before(){
        godzilla = new Godzilla("Godzilla", 4500, 1000);
        kingKong = new KingKong("Kong", 5000, 900);
        tank = new Tank("Battle Tank", 4000, 100, 500);
        jet = new Jet("Fighter Jet", 600, 300, 700);
    }

    @Test
    public void testGetName() {
        assertEquals("Kong", kingKong.getName());
        assertEquals("Godzilla", godzilla.getName());
    }

    @Test
    public void testGetAttackValue() {
        assertEquals(900, kingKong.getAttackValue(), 0.1);
        assertEquals(1000, godzilla.getAttackValue(), 0.1);
    }

    @Test
    public void testGetHealthValue() {
        assertEquals(4500, godzilla.getHealthValue());
        assertEquals(5000, kingKong.getHealthValue());
        assertEquals(4000, tank.getHealthValue());
        assertEquals(600, jet.getHealthValue());
    }

    @Test
    public void testCanRoar() {
        assertEquals("ROARR! I am Godzilla!", godzilla.roar());
        assertEquals("Kong ROARR!", kingKong.roar());
    }

    @Test
    public void getVehicleType() {
        assertEquals("Battle Tank", tank.getType());
        assertEquals("Fighter Jet", jet.getType());
    }

    @Test
    public void canAttack() {
        godzilla.attack(tank);
        kingKong.attack(jet);
        assertEquals(3000, tank.getHealthValue());
        assertEquals("Godzilla used FIRE on Battle Tank. Battle Tank's health is now 2000", godzilla.attack(tank));
        assertEquals(0, jet.getHealthValue());
        assertEquals("Kong used PUNCH on Fighter Jet. Fighter Jet's health is now 0", kingKong.attack(jet));
    }

    @Test
    public void canMove() {
        assertEquals("Godzilla swung around!", godzilla.move());
        assertEquals("Kong lunged forwards!", kingKong.move());
    }

    @Test
    public void canShoot() {
        tank.shoot(godzilla);
        jet.shoot(kingKong);
        assertEquals(4400, godzilla.getHealthValue());
        assertEquals("Battle Tank shot Godzilla. Godzilla's health is now 4300", tank.shoot(godzilla));
        assertEquals(4700, kingKong.getHealthValue());
        assertEquals("Fighter Jet shot Kong. Kong's health is now 4400", jet.shoot(kingKong));
    }

    @Test
    public void canLaunchMissile() {
        tank.launchMissile(godzilla);
        jet.launchMissile(kingKong);
        assertEquals(4000, godzilla.getHealthValue());
        assertEquals("Battle Tank launched a missile at Godzilla. Godzilla's health is now 3500", tank.launchMissile(godzilla));
        assertEquals(4300, kingKong.getHealthValue());
        assertEquals("Fighter Jet launched a missile at Kong. Kong's health is now 3600", jet.launchMissile(kingKong));
    }

}
