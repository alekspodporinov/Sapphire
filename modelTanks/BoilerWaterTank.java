package com.podp.aleks.sapphire.modelTanks;

import java.util.TreeMap;

/**
 * Created by Aleks on 15.01.2017.
 */

public class BoilerWaterTank extends BaseTank {

    public BoilerWaterTank() {
        super.tankTable = new TreeMap<>();
        super.capacityTank = 11.90;
        super.deadStock = 0.005;
        super.immeasurableStock = 0.01;
        super.maxLevelTank = 3.78;
        super.nameTank = "Цистерна котельной воды";

        super.tankTable.put(0.0, super.immeasurableStock);
        super.tankTable.put(0.1, 0.01);
        super.tankTable.put(0.2, 0.08);
        super.tankTable.put(0.3, 0.10);
        super.tankTable.put(0.4, 0.12);
        super.tankTable.put(0.5, 0.15);
        super.tankTable.put(0.6, 0.20);
        super.tankTable.put(0.7, 0.25);
        super.tankTable.put(0.8, 0.30);
        super.tankTable.put(0.9, 0.40);
        super.tankTable.put(1.0, 0.50);
        super.tankTable.put(1.1, 0.60);
        super.tankTable.put(1.2, 0.80);
        super.tankTable.put(1.3, 0.90);
        super.tankTable.put(1.4, 1.10);
        super.tankTable.put(1.5, 1.30);
        super.tankTable.put(1.6, 1.60);
        super.tankTable.put(1.7, 1.80);
        super.tankTable.put(1.8, 2.20);
        super.tankTable.put(1.9, 2.40);
        super.tankTable.put(2.0, 2.70);
        super.tankTable.put(2.1, 3.20);
        super.tankTable.put(2.2, 3.50);
        super.tankTable.put(2.3, 3.80);
        super.tankTable.put(2.4, 4.30);
        super.tankTable.put(2.5, 4.70);
        super.tankTable.put(2.6, 5.10);
        super.tankTable.put(2.7, 5.60);
        super.tankTable.put(2.8, 6.10);
        super.tankTable.put(2.9, 6.60);
        super.tankTable.put(3.0, 7.20);
        super.tankTable.put(3.1, 7.60);
        super.tankTable.put(3.2, 8.30);
        super.tankTable.put(3.3, 8.90);
        super.tankTable.put(3.4, 9.50);
        super.tankTable.put(3.5, 10.20);
        super.tankTable.put(3.6, 10.80);
        super.tankTable.put(3.7, 11.30);
        super.tankTable.put(3.78, 11.90);

    }
}
