package com.example.hayleyprior.kaijuattack;

/**
 * Created by hayleyprior on 25/10/2017.
 */

public class Runner {

    public static void main(String[] args) {
        Godzilla godzilla = new Godzilla("Lizzie", 4500, 1000);
        KingKong kingKong = new KingKong("Kong", 5000, 800);
        Jet jet = new Jet("Fighter Jet", 600, 300, 700);
        Tank tank = new Tank("Battle Tank", 3000, 100, 500);

        System.out.println(jet.shoot(kingKong));
        System.out.println(kingKong.move());
        System.out.println(godzilla.move());
        System.out.println(godzilla.attack(jet));
        System.out.println(tank.launchMissile(godzilla));
        System.out.println(kingKong.attack(tank));
        System.out.println(godzilla.attack(tank));

    }

}
