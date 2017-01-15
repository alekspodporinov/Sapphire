package com.podp.aleks.sapphire.modelTanks;

import java.util.TreeMap;

/**
 * Created by Aleks on 15.01.2017.
 */

public class PacifierTank extends BaseTank {

    public PacifierTank(){
        super.tankTable = new TreeMap<>();
        super.capacityTank = 45.97;
        super.deadStock = 0.07;
        super.immeasurableStock = 0.04;
        super.maxLevelTank = 3.63;
        super.nameTank = "Топливный успокоитель качки";

        super.tankTable.put(0.0, super.immeasurableStock);
        super.tankTable.put(0.1, 0.4);
        super.tankTable.put(0.2, 0.7);
        super.tankTable.put(0.3, 1.2);
        super.tankTable.put(0.4, 1.9);
        super.tankTable.put(0.5, 2.9);
        super.tankTable.put(0.6, 4.1);
        super.tankTable.put(0.7, 5.5);
        super.tankTable.put(0.8, 7.0);
        super.tankTable.put(0.9, 8.5);
        super.tankTable.put(1.0, 9.9);
        super.tankTable.put(1.1, 11.2);
        super.tankTable.put(1.2, 12.5);
        super.tankTable.put(1.3, 13.7);
        super.tankTable.put(1.4, 15.0);
        super.tankTable.put(1.5, 16.3);
        super.tankTable.put(1.6, 17.6);
        super.tankTable.put(1.7, 18.9);
        super.tankTable.put(1.8, 20.2);
        super.tankTable.put(1.9, 21.6);
        super.tankTable.put(2.0, 22.8);
        super.tankTable.put(2.1, 24.2);
        super.tankTable.put(2.2, 25.5);
        super.tankTable.put(2.3, 26.9);
        super.tankTable.put(2.4, 28.3);
        super.tankTable.put(2.5, 29.8);
        super.tankTable.put(2.6, 31.3);
        super.tankTable.put(2.7, 32.8);
        super.tankTable.put(2.8, 34.6);
        super.tankTable.put(2.9, 36.0);
        super.tankTable.put(3.0, 37.6);
        super.tankTable.put(3.1, 39.2);
        super.tankTable.put(3.2, 40.6);
        super.tankTable.put(3.3, 42.0);
        super.tankTable.put(3.4, 43.3);
        super.tankTable.put(3.5, 44.6);
        super.tankTable.put(3.6, 45.8);
        super.tankTable.put(3.63, 45.97);

    }
}
