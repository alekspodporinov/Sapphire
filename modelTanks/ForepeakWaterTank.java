package com.podp.aleks.sapphire.modelTanks;

import java.util.TreeMap;

/**
 * Created by Aleks on 15.01.2017.
 */

public class ForepeakWaterTank extends BaseTank {
    public ForepeakWaterTank(){
        super.tankTable = new TreeMap<>();
        super.capacityTank = 41.66;
        super.deadStock = 0.005;
        super.immeasurableStock = 0.005;
        super.maxLevelTank = 6.32;
        super.nameTank = "Форпик";

        super.tankTable.put(0.0, super.immeasurableStock);
        super.tankTable.put(0.5, 0.1);
        super.tankTable.put(1.0, 0.5);
        super.tankTable.put(1.5, 1.7);
        super.tankTable.put(2.0, 3.7);
        super.tankTable.put(3.5, 6.6);
        super.tankTable.put(3.0, 9.1);
        super.tankTable.put(3.5, 13.3);
        super.tankTable.put(4.0, 18.5);
        super.tankTable.put(4.5, 25.0);
        super.tankTable.put(5.0, 31.6);
        super.tankTable.put(5.5, 37.5);
        super.tankTable.put(6.0, 41.0);
        super.tankTable.put(6.32, 41.66);
    }
}
