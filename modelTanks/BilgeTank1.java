package com.podp.aleks.sapphire.modelTanks;

import java.util.TreeMap;

public class BilgeTank1 extends BaseTank {

    public BilgeTank1(){
        super.tankTable = new TreeMap<>();
        super.capacityTank = 9.43;
        super.deadStock = 0.03;
        super.immeasurableStock = 0.03;
        super.maxLevelTank = 1.39;
        super.nameTank = "Лияльный танк 1";

        super.tankTable.put(0.0, super.immeasurableStock);
        super.tankTable.put(0.1, 0.07);
        super.tankTable.put(0.2, 0.30);
        super.tankTable.put(0.3, 0.69);
        super.tankTable.put(0.4, 1.20);
        super.tankTable.put(0.5, 1.82);
        super.tankTable.put(0.6, 2.51);
        super.tankTable.put(0.7, 3.27);
        super.tankTable.put(0.8, 4.07);
        super.tankTable.put(0.9, 4.90);
        super.tankTable.put(1.0, 5.77);
        super.tankTable.put(1.1, 6.68);
        super.tankTable.put(1.2, 7.62);
        super.tankTable.put(1.3, 8.59);
        super.tankTable.put(1.39, 9.43);
    }
}
