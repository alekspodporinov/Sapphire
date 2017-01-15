package com.podp.aleks.sapphire.modelTanks;

import java.util.TreeMap;

/**
 * Created by Aleks on 12.01.2017.
 */

public class FuelTank3 extends BaseTank {

    public FuelTank3() {
        super.tankTable = new TreeMap<>();
        super.capacityTank = 10.16;
        super.deadStock = 0.05;
        super.immeasurableStock = 0.06;
        super.maxLevelTank = 1.44;
        super.nameTank = "Топливный танк 3";

        super.tankTable.put(0.0, super.immeasurableStock);
        super.tankTable.put(0.1, 0.1);
        super.tankTable.put(0.2, 0.3);
        super.tankTable.put(0.3, 0.6);
        super.tankTable.put(0.4, 1.1);
        super.tankTable.put(0.5, 1.8);
        super.tankTable.put(0.6, 2.7);
        super.tankTable.put(0.7, 3.6);
        super.tankTable.put(0.8, 4.7);
        super.tankTable.put(0.9, 5.7);
        super.tankTable.put(1.0, 6.9);
        super.tankTable.put(1.1, 8.0);
        super.tankTable.put(1.2, 8.9);
        super.tankTable.put(1.3, 9.7);
        super.tankTable.put(1.4, 10.1);
        super.tankTable.put(1.44, 10.16);

    }
}