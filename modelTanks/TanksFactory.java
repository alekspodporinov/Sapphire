package com.podp.aleks.sapphire.modelTanks;

/**
 * Created by Aleks on 12.01.2017.
 */

public class TanksFactory {
    public BaseTank getTank(String obj){
        if(obj == null){
            return null;
        }
        switch (obj){
            case "bilgeTank1":
                return new BilgeTank1();
            case "bilgeTank2":
                return new BilgeTank2();
            case "fuelTank1":
                return new FuelTank1();
            case "fuelTank2":
                return new FuelTank2();
            case "fuelTank3":
                return new FuelTank3();
            case "fuelTank4":
                return new FuelTank4();
            case "fuelTank6":
                return new FuelTank6();
            default:
                return null;
        }
    }
}
