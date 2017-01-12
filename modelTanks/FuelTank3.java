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
        super.nameTank = "Топливный танк 3";

        tankTable.put(0.1, 0.1);
        tankTable.put(0.2, 0.3);
        tankTable.put(0.3, 0.6);
        tankTable.put(0.4, 1.1);
        tankTable.put(0.5, 1.8);
        tankTable.put(0.6, 2.7);
        tankTable.put(0.7, 3.6);
        tankTable.put(0.8, 4.7);
        tankTable.put(0.9, 5.7);
        tankTable.put(1.0, 6.9);
        tankTable.put(1.1, 8.0);
        tankTable.put(1.2, 8.9);
        tankTable.put(1.3, 9.7);
        tankTable.put(1.4, 10.1);
        tankTable.put(1.44, 10.16);

    }
}