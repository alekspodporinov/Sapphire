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
            case "waterTank1":
                return new WaterTank1();
            case "waterTank2":
                return new WaterTank2();
            case "boilerTank":
                return new BoilerWaterTank();
            case "forepeak":
                return new ForepeakWaterTank();
            case "afterpeak":
                return new AfterpeakWaterTank();
            case "overflowTank":
                return new OverflowTank();
            case "pacifierTank":
                return new PacifierTank();
            default:
                return null;
        }
    }
}
