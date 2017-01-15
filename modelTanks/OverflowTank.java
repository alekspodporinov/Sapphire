package com.podp.aleks.sapphire.modelTanks;

import java.util.TreeMap;

/**
 * Created by Aleks on 15.01.2017.
 */

public class OverflowTank extends BaseTank {
    public OverflowTank() {
        super.tankTable = new TreeMap<>();
        super.capacityTank = 13.23;
        super.deadStock = 00.03;
        super.immeasurableStock = 0.06;
        super.maxLevelTank = 1.42;
        super.nameTank = "Переливная топливня цистерна";

        super.tankTable.put(0.0, super.immeasurableStock);
        super.tankTable.put(0.1, 0.3);
        super.tankTable.put(0.2, 0.7);
        super.tankTable.put(0.3, 1.2);
        super.tankTable.put(0.4, 1.8);
        super.tankTable.put(0.5, 2.7);
        super.tankTable.put(0.6, 3.9);
        super.tankTable.put(0.7, 5.2);
        super.tankTable.put(0.8, 6.6);
        super.tankTable.put(0.9, 8.0);
        super.tankTable.put(1.0, 9.5);
        super.tankTable.put(1.1, 10.8);
        super.tankTable.put(1.2, 12.0);
        super.tankTable.put(1.3, 12.8);
        super.tankTable.put(1.4, 13.2);
        super.tankTable.put(1.5, 13.23);
    }
}
