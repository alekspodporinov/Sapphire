package com.podp.aleks.sapphire.modelTanks;

import java.util.TreeMap;

/**
 * Created by Aleks on 15.01.2017.
 */

public class AfterpeakWaterTank extends BaseTank {

    public AfterpeakWaterTank(){
        super.tankTable = new TreeMap<>();
        super.capacityTank = 15.2;
        super.deadStock = 0.05;
        super.immeasurableStock = 0.015;
        super.maxLevelTank = 3.4;
        super.nameTank = "Ахтерпик";

        super.tankTable.put(0.0, super.immeasurableStock);
        super.tankTable.put(0.5,0.5);
        super.tankTable.put(1.0,0.9);
        super.tankTable.put(1.5,1.8);
        super.tankTable.put(2.0,3.5);
        super.tankTable.put(2.5,6.1);
        super.tankTable.put(3.0,10.2);
        super.tankTable.put(3.4,15.2);
    }
}
