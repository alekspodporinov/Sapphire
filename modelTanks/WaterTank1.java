package com.podp.aleks.sapphire.modelTanks;

import java.util.TreeMap;

/**
 * Created by Aleks on 15.01.2017.
 */

public class WaterTank1 extends BaseTank {
    public WaterTank1(){
        super.tankTable = new TreeMap<>();
        super.capacityTank = 18.6;
        super.deadStock = 0.1;
        super.immeasurableStock = 0.7;
        super.maxLevelTank = 2.4;
        super.nameTank = "Цистерна питьевой воды 1";

        super.tankTable.put(0.0, super.immeasurableStock);
        super.tankTable.put(0.1, 0.5);
        super.tankTable.put(0.2, 1.1);
        super.tankTable.put(0.3, 1.7);
        super.tankTable.put(0.4, 2.4);
        super.tankTable.put(0.5, 3.0);
        super.tankTable.put(0.6, 3.7);
        super.tankTable.put(0.7, 4.3);
        super.tankTable.put(0.8, 5.0);
        super.tankTable.put(0.9, 5.7);
        super.tankTable.put(1.0, 6.4);
        super.tankTable.put(1.1, 7.1);
        super.tankTable.put(1.2, 7.8);
        super.tankTable.put(1.3, 8.7);
        super.tankTable.put(1.4, 9.5);
        super.tankTable.put(1.5, 10.4);
        super.tankTable.put(1.6, 11.4);
        super.tankTable.put(1.7, 12.3);
        super.tankTable.put(1.8, 13.2);
        super.tankTable.put(1.9, 14.1);
        super.tankTable.put(2.0, 15.1);
        super.tankTable.put(2.1, 16.0);
        super.tankTable.put(2.2, 17.0);
        super.tankTable.put(2.3, 18.0);
        super.tankTable.put(2.4, 18.6);
    }
}
