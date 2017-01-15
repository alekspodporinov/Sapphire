package com.podp.aleks.sapphire.modelTanks;

import java.util.TreeMap;

/**
 * Created by Aleks on 12.01.2017.
 */

public class FuelTank1 extends BaseTank {

    public FuelTank1(){
        super.tankTable = new TreeMap<>();
        super.capacityTank = 19.4;
        super.deadStock = 0.65;
        super.immeasurableStock = 0.05;
        super.maxLevelTank = 2.48;
        super.nameTank = "Топливный танк 1";

        super.tankTable.put(0.0, super.immeasurableStock);
        super.tankTable.put(0.1, 0.6);
        super.tankTable.put(0.2, 1.2);
        super.tankTable.put(0.3, 1.9);
        super.tankTable.put(0.4, 2.6);
        super.tankTable.put(0.5, 3.4);
        super.tankTable.put(0.6, 4.1);
        super.tankTable.put(0.7, 4.8);
        super.tankTable.put(0.8, 5.6);
        super.tankTable.put(0.9, 6.3);
        super.tankTable.put(1.0, 7.1);
        super.tankTable.put(1.1, 7.9);
        super.tankTable.put(1.2, 8.6);
        super.tankTable.put(1.3, 9.5);
        super.tankTable.put(1.4, 10.3);
        super.tankTable.put(1.5, 11.2);
        super.tankTable.put(1.6, 12.1);
        super.tankTable.put(1.7, 13.0);
        super.tankTable.put(1.8, 13.9);
        super.tankTable.put(1.9, 14.7);
        super.tankTable.put(2.0, 15.6);
        super.tankTable.put(2.1, 16.6);
        super.tankTable.put(2.2, 17.4);
        super.tankTable.put(2.3, 18.3);
        super.tankTable.put(2.4, 19.0);
        super.tankTable.put(2.48, 19.4);
    }
}
