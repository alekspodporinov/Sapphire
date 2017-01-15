package com.podp.aleks.sapphire.modelTanks;

import java.util.TreeMap;

/**
 * Created by Aleks on 12.01.2017.
 */

public class BilgeTank2 extends BaseTank {

    public BilgeTank2() {
        super.tankTable = new TreeMap<>();
        super.capacityTank = 12.18;
        super.deadStock = 0.03;
        super.immeasurableStock = 0.03;
        super.maxLevelTank = 1.44;
        super.nameTank = "Лияльный танк 2";

        super.tankTable.put(0.0, super.immeasurableStock);
        super.tankTable.put(0.1, 0.06);
        super.tankTable.put(0.2, 0.25);
        super.tankTable.put(0.3, 0.60);
        super.tankTable.put(0.4, 1.10);
        super.tankTable.put(0.5, 1.80);
        super.tankTable.put(0.6, 2.70);
        super.tankTable.put(0.7, 3.75);
        super.tankTable.put(0.8, 5.10);
        super.tankTable.put(0.9, 6.50);
        super.tankTable.put(1.0, 7.85);
        super.tankTable.put(1.1, 8.90);
        super.tankTable.put(1.2, 9.75);
        super.tankTable.put(1.3, 10.80);
        super.tankTable.put(1.4, 9.43);
        super.tankTable.put(1.44, 12.18);
    }
}
