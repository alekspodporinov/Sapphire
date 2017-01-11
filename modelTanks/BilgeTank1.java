package com.podp.aleks.sapphire.modelTanks;

import java.util.Map;
import java.util.TreeMap;

public class BilgeTank1 extends BaseTank {
   private Map<Double, Double> bilgeTank1 = new TreeMap<>();

    public BilgeTank1(){
        super.capacityTank = 9.43;
        super.deadStock = 0.03;
        super.immeasurableStock = 0.03;

        bilgeTank1.put(0.1, 0.07);
        bilgeTank1.put(0.2, 0.30);
        bilgeTank1.put(0.3, 0.69);
        bilgeTank1.put(0.4, 1.20);
        bilgeTank1.put(0.5, 1.82);
        bilgeTank1.put(0.6, 2.51);
        bilgeTank1.put(0.7, 3.27);
        bilgeTank1.put(0.8, 4.07);
        bilgeTank1.put(0.9, 4.90);
        bilgeTank1.put(1.0, 5.77);
        bilgeTank1.put(1.1, 6.68);
        bilgeTank1.put(1.2, 7.62);
        bilgeTank1.put(1.3, 8.59);
        bilgeTank1.put(1.39, 9.43);
    }

    @Override
    public Double GetStock(Double level) {
        Double resCapacity = bilgeTank1.get(level);
        if (resCapacity != null)
            return resCapacity;


        Double maxLevel = 0.0;
        Double minLevel = 0.0;


        for (Double key : bilgeTank1.keySet()) {
            if (key < level) {
                minLevel = key;
            } else {
                maxLevel = key;
                break;
            }
        }

        Double minCapacity = bilgeTank1.get(minLevel);
        Double maxCapacity = bilgeTank1.get(maxLevel);

        level *= 100;
        maxLevel *= 100;
        minLevel *= 100;

        Double inOneCapacity = (maxCapacity - minCapacity) / (maxLevel - minLevel);
        resCapacity = (inOneCapacity * (level - minLevel)) + minCapacity;

        return resCapacity;
    }
}
