package com.podp.aleks.sapphire.modelTanks;

import java.util.TreeMap;

/**
 * Created by Aleks on 12.01.2017.
 */

public class FuelTank2 extends BaseTank {

    public FuelTank2() {
        super.tankTable = new TreeMap<>();
        super.capacityTank = 26.0;
        super.deadStock = 0.23;
        super.immeasurableStock = 0.05;
        super.maxLevelTank = 3.4;
        super.nameTank = "Топливный танк 2";

        super.tankTable.put(0.0, super.immeasurableStock);
        super.tankTable.put(0.1, 0.1);
        super.tankTable.put(0.2, 0.3);
        super.tankTable.put(0.3, 0.7);
        super.tankTable.put(0.4, 1.2);
        super.tankTable.put(0.5, 1.9);
        super.tankTable.put(0.6, 2.6);
        super.tankTable.put(0.7, 3.4);
        super.tankTable.put(0.8, 4.2);
        super.tankTable.put(0.9, 5.2);
        super.tankTable.put(1.0, 6.1);
        super.tankTable.put(1.1, 6.9);
        super.tankTable.put(1.2, 7.7);
        super.tankTable.put(1.3, 8.5);
        super.tankTable.put(1.4, 9.3);
        super.tankTable.put(1.5, 10.3);
        super.tankTable.put(1.6, 11.3);
        super.tankTable.put(1.7, 12.4);
        super.tankTable.put(1.8, 13.4);
        super.tankTable.put(1.9, 14.5);
        super.tankTable.put(2.0, 15.6);
        super.tankTable.put(2.1, 16.4);
        super.tankTable.put(2.2, 17.2);
        super.tankTable.put(2.3, 18.0);
        super.tankTable.put(2.4, 18.7);
        super.tankTable.put(2.5, 19.4);
        super.tankTable.put(2.6, 20.1);
        super.tankTable.put(2.7, 20.8);
        super.tankTable.put(2.8, 21.5);
        super.tankTable.put(2.9, 22.3);
        super.tankTable.put(3.0, 23.0);
        super.tankTable.put(3.1, 23.7);
        super.tankTable.put(3.2, 24.5);
        super.tankTable.put(3.3, 25.2);
        super.tankTable.put(3.4, 26.0);

    }
}