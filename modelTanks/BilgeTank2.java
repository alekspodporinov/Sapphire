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
        super.nameTank = "Лияльный танк 2";

        tankTable.put(0.1, 0.06);
        tankTable.put(0.2, 0.25);
        tankTable.put(0.3, 0.60);
        tankTable.put(0.4, 1.10);
        tankTable.put(0.5, 1.80);
        tankTable.put(0.6, 2.70);
        tankTable.put(0.7, 3.75);
        tankTable.put(0.8, 5.10);
        tankTable.put(0.9, 6.50);
        tankTable.put(1.0, 7.85);
        tankTable.put(1.1, 8.90);
        tankTable.put(1.2, 9.75);
        tankTable.put(1.3, 10.80);
        tankTable.put(1.4, 9.43);
        tankTable.put(1.44, 12.18);
    }
}
