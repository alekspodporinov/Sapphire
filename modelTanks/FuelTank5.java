package com.podp.aleks.sapphire.modelTanks;

import java.util.TreeMap;

/**
 * Created by Aleks on 05.02.2017.
 */

public class FuelTank5 extends BaseTank {

    public FuelTank5(){
        super.tankTable = new TreeMap<>();
        super.capacityTank = 37.13;
        super.deadStock = 0.09;
        super.immeasurableStock = 0.13;
        super.maxLevelTank = 1.56;
        super.nameTank = "Топливный танк 5";

        super.tankTable.put(0.0, super.immeasurableStock);
        super.tankTable.put(0.1, 0.4);
        super.tankTable.put(0.2, 0.8);
        super.tankTable.put(0.3, 1.6);
        super.tankTable.put(0.4, 2.7);
        super.tankTable.put(0.5, 4.2);
        super.tankTable.put(0.6, 6.2);
        super.tankTable.put(0.7, 8.6);
        super.tankTable.put(0.8, 11.3);
        super.tankTable.put(0.9, 14.2);
        super.tankTable.put(1.0, 17.4);
        super.tankTable.put(1.1, 20.6);
        super.tankTable.put(1.2, 24.1);
        super.tankTable.put(1.3, 27.7);
        super.tankTable.put(1.4, 31.4);
        super.tankTable.put(1.5, 35.1);
        super.tankTable.put(1.56, 37.13);

    }
}
