package com.podp.aleks.sapphire.modelTanks;

import java.util.TreeMap;

/**
 * Created by Aleks on 05.02.2017.
 */

public class FuelTank8 extends BaseTank {

    public FuelTank8(){
        super.tankTable = new TreeMap<>();
        super.capacityTank = 55.2;
        super.deadStock = 0.0;
        super.immeasurableStock = 0.25;
        super.maxLevelTank = 3.38;
        super.nameTank = "Топливный танк 8";

        super.tankTable.put(0.0, super.immeasurableStock);
        super.tankTable.put(0.1, 0.5);
        super.tankTable.put(0.2, 1.0);
        super.tankTable.put(0.3, 2.0);
        super.tankTable.put(0.4, 3.0);
        super.tankTable.put(0.5, 4.0);
        super.tankTable.put(0.6, 5.0);
        super.tankTable.put(0.7, 6.2);
        super.tankTable.put(0.8, 7.8);
        super.tankTable.put(0.9, 9.0);
        super.tankTable.put(1.0, 10.0);
        super.tankTable.put(1.1, 12.0);
        super.tankTable.put(1.2, 13.0);
        super.tankTable.put(1.3, 14.6);
        super.tankTable.put(1.4, 16.5);
        super.tankTable.put(1.5, 18.4);
        super.tankTable.put(1.6, 20.0);
        super.tankTable.put(1.7, 22.0);
        super.tankTable.put(1.8, 24.0);
        super.tankTable.put(1.9, 26.0);
        super.tankTable.put(2.0, 28.0);
        super.tankTable.put(2.1, 30.5);
        super.tankTable.put(2.2, 32.0);
        super.tankTable.put(2.3, 34.3);
        super.tankTable.put(2.4, 36.6);
        super.tankTable.put(2.5, 39.0);
        super.tankTable.put(2.6, 41.5);
        super.tankTable.put(2.7, 44.0);
        super.tankTable.put(2.8, 46.0);
        super.tankTable.put(2.9, 48.5);
        super.tankTable.put(3.0, 51.0);
        super.tankTable.put(3.1, 53.5);
        super.tankTable.put(3.2, 54.5);
        super.tankTable.put(3.3, 54.9);
        super.tankTable.put(3.38, 55.2);

    }
}
