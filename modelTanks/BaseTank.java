package com.podp.aleks.sapphire.modelTanks;


public abstract class BaseTank {
    protected Double capacityTank;
    protected Double deadStock;
    protected Double immeasurableStock;

    public Double GetCapacityTank(){
        return capacityTank;
    }

    public Double GetDeadStock(){
        return deadStock;
    }

    public Double GetImmeasurableStock(){
        return immeasurableStock;
    }

    abstract public Double GetStock(Double level);
}
