package com.podp.aleks.sapphire.modelTanks;

import java.util.TreeMap;

public class BilgeTank1 extends BaseTank {

    public BilgeTank1(){
        super.tankTable = new TreeMap<>();
        super.capacityTank = 9.43;
        super.deadStock = 0.03;
        super.immeasurableStock = 0.03;
        super.nameTank = "Лияльный танк 1";

        tankTable.put(0.1, 0.07);
        tankTable.put(0.2, 0.30);
        tankTable.put(0.3, 0.69);
        tankTable.put(0.4, 1.20);
        tankTable.put(0.5, 1.82);
        tankTable.put(0.6, 2.51);
        tankTable.put(0.7, 3.27);
        tankTable.put(0.8, 4.07);
        tankTable.put(0.9, 4.90);
        tankTable.put(1.0, 5.77);
        tankTable.put(1.1, 6.68);
        tankTable.put(1.2, 7.62);
        tankTable.put(1.3, 8.59);
        tankTable.put(1.39, 9.43);
    }
}
