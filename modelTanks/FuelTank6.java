package com.podp.aleks.sapphire.modelTanks;

import java.util.TreeMap;

/**
 * Created by Aleks on 12.01.2017.
 */

public class FuelTank6 extends BaseTank {

        public FuelTank6() {
            super.tankTable = new TreeMap<>();
            super.capacityTank = 38.96;
            super.deadStock = 0.3;
            super.immeasurableStock = 0.01;
            super.maxLevelTank = 4.48;
            super.nameTank = "Топливный танк 6";

            super.tankTable.put(0.0, super.immeasurableStock);
            super.tankTable.put(0.1, 0.01);
            super.tankTable.put(0.2, 0.1);
            super.tankTable.put(0.3, 0.2);
            super.tankTable.put(0.4, 0.3);
            super.tankTable.put(0.5, 0.4);
            super.tankTable.put(0.6, 0.5);
            super.tankTable.put(0.7, 0.7);
            super.tankTable.put(0.8, 0.9);
            super.tankTable.put(0.9, 1.3);
            super.tankTable.put(1.0, 1.6);
            super.tankTable.put(1.1, 2.0);
            super.tankTable.put(1.2, 2.4);
            super.tankTable.put(1.3, 2.9);
            super.tankTable.put(1.4, 3.3);
            super.tankTable.put(1.5, 3.8);
            super.tankTable.put(1.6, 4.2);
            super.tankTable.put(1.7, 4.5);
            super.tankTable.put(1.8, 5.0);
            super.tankTable.put(1.9, 5.5);
            super.tankTable.put(2.0, 6.0);
            super.tankTable.put(2.1, 6.4);
            super.tankTable.put(2.2, 7.0);
            super.tankTable.put(2.3, 7.8);
            super.tankTable.put(2.4, 8.5);
            super.tankTable.put(2.5, 9.3);
            super.tankTable.put(2.6, 10.0);
            super.tankTable.put(2.7, 11.0);
            super.tankTable.put(2.8, 12.0);
            super.tankTable.put(2.9, 13.0);
            super.tankTable.put(3.0, 14.0);
            super.tankTable.put(3.1, 15.3);
            super.tankTable.put(3.2, 16.4);
            super.tankTable.put(3.3, 17.7);
            super.tankTable.put(3.4, 19.0);
            super.tankTable.put(3.5, 20.0);
            super.tankTable.put(3.6, 21.3);
            super.tankTable.put(3.7, 22.8);
            super.tankTable.put(3.8, 24.4);
            super.tankTable.put(3.9, 26.2);
            super.tankTable.put(4.0, 28.1);
            super.tankTable.put(4.1, 30.5);
            super.tankTable.put(4.2, 32.7);
            super.tankTable.put(4.3, 34.8);
            super.tankTable.put(4.4, 37.5);
            super.tankTable.put(4.48, 38.96);


        }
}
