package com.podp.aleks.sapphire.modelTanks;


import java.util.Map;

public abstract class BaseTank {
    protected Double capacityTank;
    protected Double deadStock;
    protected Double immeasurableStock;
    protected String nameTank;
    protected Map<Double, Double> tankTable;

    public Double GetCapacityTank(){
        return capacityTank;
    }

    public Double GetDeadStock(){
        return deadStock;
    }

    public Double GetImmeasurableStock(){
        return immeasurableStock;
    }

    public String GetName(){ return nameTank; }

    public Double GetStock(Double level){
        Double resCapacity = tankTable.get(level);
        if (resCapacity != null)
            return resCapacity;


        Double maxLevel = 0.0;
        Double minLevel = 0.0;


        for (Double key : tankTable.keySet()) {
            if (key < level) {
                minLevel = key;
            } else {
                maxLevel = key;
                break;
            }
        }

        Double minCapacity = tankTable.get(minLevel);
        Double maxCapacity = tankTable.get(maxLevel);

        level *= 100;
        maxLevel *= 100;
        minLevel *= 100;

        Double inOneCapacity = (maxCapacity - minCapacity) / (maxLevel - minLevel);
        resCapacity = (inOneCapacity * (level - minLevel)) + minCapacity;

        return resCapacity;
    }
}
