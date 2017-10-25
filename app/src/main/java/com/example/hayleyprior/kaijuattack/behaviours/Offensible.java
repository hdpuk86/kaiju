package com.example.hayleyprior.kaijuattack.behaviours;

import com.example.hayleyprior.kaijuattack.Kaiju;
import com.example.hayleyprior.kaijuattack.Vehicle;

/**
 * Created by hayleyprior on 25/10/2017.
 */

public interface Offensible {

    String shoot(Kaiju kaiju);
    String launchMissile(Kaiju kaiju);

}
